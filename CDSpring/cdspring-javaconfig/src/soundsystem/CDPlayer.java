package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vegeta on 1/17/17.
 */
//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

//    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
