package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vegeta on 1/19/17.
 */
@Configuration
public class CDPlayerConfig {
//    @Bean
//    public CompactDisc sgtPeppers() {
//        return new SgtPeppers();
//    }

//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = (int) Math.floor(Math.random() * 3);
//        System.out.println("choice: " + choice);
//        if (choice == 0) {
//            return new SgtPeppers();
//        } else if (choice == 1) {
//            return new SgtPeppers();
//        } else {
//            return new SgtPeppers();
//        }
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

//    @Bean
//    public CDPlayer anotherCDPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }
}
