package in.theinsanetechie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SpringFromScratchApplication {

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringFromScratchApplication.class, args);
    }

    @RestController
    class HelloWorldController {

        @RequestMapping("/")
        public String hello() {
            return "hello world";
        }

    }
}
