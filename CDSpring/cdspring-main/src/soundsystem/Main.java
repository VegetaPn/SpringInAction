package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vegeta on 1/15/17.
 */
public class Main {
    @Autowired
    static CompactDisc cd;

    public static void main(String[] args) {
        cd.play();
    }
}
