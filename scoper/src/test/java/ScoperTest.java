import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScoperConfig.class)
public class ScoperTest {
    @Autowired
    private Scoper sessionScoper;

    @Autowired
    private Scoper requestScoper;

    @Autowired
    private Scoper prototypeScoper;

    @Autowired
    private Scoper singletonScoper;

    @Autowired
    private ScoperOwner scoperOwner;


    @Test
    public void someMethodTest(){
        //Assert.assertNotNull(sessionScoper);
        Assert.assertNotNull(singletonScoper);
        Assert.assertNotNull(prototypeScoper);
       // Assert.assertNotNull(requestScoper);
        Assert.assertNotNull(scoperOwner);

       // sessionScoper.someMethod();
       // requestScoper.someMethod();
        singletonScoper.someMethod();
        prototypeScoper.someMethod();
        scoperOwner.doSome();
        scoperOwner.doPrototype();
    }

    @Test
    public void singletonTest(){
        Assert.assertEquals(singletonScoper, scoperOwner.getScoper());
    }

    @Test
    public void prototypeTest(){
        Assert.assertEquals(prototypeScoper, scoperOwner.getPrototypeScoper());
    }
}
