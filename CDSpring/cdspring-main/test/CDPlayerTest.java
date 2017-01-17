import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Vegeta on 1/15/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring.xml")
public class CDPlayerTest {

    @Autowired
    CompactDisc cd;

    @Test
    public void testCdShouldNotBeNull() {
        assertNotNull(cd);
        cd.play();
    }
}
