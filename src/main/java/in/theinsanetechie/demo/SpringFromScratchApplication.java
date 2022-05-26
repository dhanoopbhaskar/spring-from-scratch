package in.theinsanetechie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SpringFromScratchApplication {

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory();
    }

    @Bean
    DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringFromScratchApplication.class, args);
    }

}
