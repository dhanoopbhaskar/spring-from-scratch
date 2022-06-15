package in.theinsanetechie.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
@ConditionalOnMyClass(className = "org.apache.catalina.startup.Tomcat")
public class TomcatConfiguration {

    @Value("${port:8080}")
    private int port;

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory(this.port);
    }

}
