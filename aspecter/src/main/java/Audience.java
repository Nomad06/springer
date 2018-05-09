import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.BeforeAdvice;

@Aspect
public class Audience {

    @Pointcut("execution(** (bubalex.Perfomance))")
    public void perfomance(){}

    @Before("perfomance()")
    public void silenceCellPhones(){

    }

    @Before("perfomance()")
    public void takeSeats(){

    }

    @AfterReturning("perfomance()")
    public void applause(){

    }

    @AfterThrowing("perfomance()")
    public void demandRefund(){

    }
}
