import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Vegeta on 1/15/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    MediaPlayer player;

    @Autowired
    CompactDisc cd;

    @Test
    public void testCdShouldNotBeNull() {
        assertNotNull(cd);
        cd.play();
    }

    @Test
    public void testMediaPlay() {
        player.play();
    }
}
