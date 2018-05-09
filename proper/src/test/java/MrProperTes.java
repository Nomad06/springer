import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProperConfig.class)
public class MrProperTes {
    @Autowired
    private MrProper mrProperBold;

    @Autowired
    private MrProper mrProperHair;

    @Test
    public void doCleaningTest(){
        Assert.assertNotNull(mrProperBold);
        Assert.assertNotNull(mrProperHair);

        mrProperBold.doCleaning();
        mrProperHair.doCleaning();

        Assert.assertEquals(((MrProperBold) mrProperBold).isBold(), true);
        Assert.assertEquals(((MrProperHair) mrProperHair).isBold(), false);

    }
}
