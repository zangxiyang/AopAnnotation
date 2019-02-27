package annotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationTest/applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        //前置通知和后置通知
        helloWorld.doPrint();
        System.out.println("------------------------------------");
        //没有切面通知
        helloWorld.printHelloWorld();
        System.out.println("------------------------------------");
        //测试环绕通知
        helloWorld.buySomeThing();
    }
}
