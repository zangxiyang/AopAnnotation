package annotationTest;

import org.springframework.stereotype.Repository;

@Repository("helloWorld")
public class HelloWorldImpl implements HelloWorld {


    @Override
    public void printHelloWorld() {
        System.out.println("Enter->printHelloWorldImpl->printHelloWorld");

    }

    @Override
    public void doPrint() {
        System.out.println("Enter->printHelloWorldImpl->doPrint");
    }

    @Override
    public void buySomeThing() {
        System.out.println("Enter -> 购买了一件物品");
    }


}
