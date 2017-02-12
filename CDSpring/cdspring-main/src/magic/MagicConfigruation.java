package magic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vegeta on 2/12/17.
 */
@Configuration
public class MagicConfigruation {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
