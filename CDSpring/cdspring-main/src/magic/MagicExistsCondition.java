package magic;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Vegeta on 2/12/17.
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env =conditionContext.getEnvironment();
//        return env.containsProperty("magic");
        return true;
//        return false;
    }
}
