import base.CDPlayer;
import base.CompactDisc;
import base.SoundSystemConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {
    @Autowired
    @Qualifier("peppa")
    private CompactDisc cd1;

    @Autowired
    @Qualifier("beat")
    private CompactDisc cd2;

    @Autowired
    @Qualifier("disk")
    private CompactDisc cd3;

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd2);
        Assert.assertNotNull(cd1);
        Assert.assertNotNull(cdPlayer);
        Assert.assertNotNull(cd3);
    }
}
