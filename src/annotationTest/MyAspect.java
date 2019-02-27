package annotationTest;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    //定义切入点
    @Pointcut("execution(* annotationTest.HelloWorldImpl.doPrint())")
    private void MyAspect(){}
    /**
     * 模拟检查权限
     */
    @Before("MyAspect()")
    public void checkedPower(){
        System.out.println("模拟检查权限操作......");
    }

    /**
     * 模拟日志记录
     */
    @AfterReturning("MyAspect()")
    public void log(){
        System.out.println("模拟记录日志.......");
    }

    @Around("execution(* annotationTest.HelloWorldImpl.buySomeThing())")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("环绕开始......");
        checkedPower();
        Object obj = joinPoint.proceed();
        log();
        System.out.println("环绕通知结束........");
        return null;
    }
}
