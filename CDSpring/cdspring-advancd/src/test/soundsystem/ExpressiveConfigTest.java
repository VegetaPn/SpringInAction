package test.soundsystem; 

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.BlankDisc;
import soundsystem.ExpressiveConfig;

/** 
* ExpressiveConfig Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 19, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveConfigTest {

    @Autowired
    BlankDisc blankDisc;

    @Test
    public void testDisc() throws Exception {
        blankDisc.play();
    }


} 
