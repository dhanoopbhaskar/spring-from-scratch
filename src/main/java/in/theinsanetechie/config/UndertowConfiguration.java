package in.theinsanetechie.config;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
@ConditionalOnMyClass(className = "io.undertow.Undertow")
public class UndertowConfiguration {

    @Bean
    public UndertowServletWebServerFactory servletContainer() {
        return new UndertowServletWebServerFactory();
    }

}
