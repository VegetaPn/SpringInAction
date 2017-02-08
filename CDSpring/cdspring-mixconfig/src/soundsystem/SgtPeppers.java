package soundsystem;//package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 1/15/17.
 */
public class SgtPeppers implements CompactDisc {

    private String title = "sgtpeppers";
    private String artist = "Art-Sgtpeppers";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
