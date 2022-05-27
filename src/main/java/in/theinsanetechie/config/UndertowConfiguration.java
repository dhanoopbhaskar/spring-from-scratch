package in.theinsanetechie.config;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
@Conditional(UndertowConfiguration.OnUndertowCondition.class)
public class UndertowConfiguration {

    @Bean
    public UndertowServletWebServerFactory servletContainer() {
        return new UndertowServletWebServerFactory();
    }

    static class OnUndertowCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return ClassUtils.isPresent("io.undertow.Undertow", context.getClassLoader());
        }
    }
}
