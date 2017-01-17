package soundsystem;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Vegeta on 1/15/17.
 */
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void testCdShouldNotBeNull() {
        assertNotNull(cd);
    }
}
