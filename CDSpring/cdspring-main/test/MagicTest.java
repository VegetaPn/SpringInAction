import magic.MagicBean;
import magic.MagicConfigruation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Vegeta on 1/15/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfigruation.class)
public class MagicTest {

    @Autowired
    MagicBean magicBean;

    @Test
    public void testMagicBean() {
//        Assert.assertNull(magicBean);
        assertNotNull(magicBean);
    }
}
