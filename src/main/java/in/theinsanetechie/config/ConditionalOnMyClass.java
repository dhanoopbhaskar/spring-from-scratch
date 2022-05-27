package in.theinsanetechie.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnMyClassCondition.class)
public @interface ConditionalOnMyClass {
    String className();
}
