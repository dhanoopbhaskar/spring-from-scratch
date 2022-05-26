package in.theinsanetechie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFromScratchApplication {

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringFromScratchApplication.class, args);
    }

}
