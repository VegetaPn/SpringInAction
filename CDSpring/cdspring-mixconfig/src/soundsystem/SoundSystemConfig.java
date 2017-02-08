package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Vegeta on 2/8/17.
 */
@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:spring.xml")
public class SoundSystemConfig {
}
