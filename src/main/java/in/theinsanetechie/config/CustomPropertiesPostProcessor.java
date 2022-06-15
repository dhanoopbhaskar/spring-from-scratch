package in.theinsanetechie.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Properties;

public class CustomPropertiesPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        ClassPathResource resource = new ClassPathResource("custom.properties");
        if (resource.exists()) {
            PropertySource<?> source = getPropertySource(resource);
            environment.getPropertySources().addLast(source);
        }
    }

    private PropertySource<?> getPropertySource(ClassPathResource resource) {
        try {
            Properties properties = new Properties();
            properties.load(resource.getInputStream());
            return new PropertiesPropertySource("custom", properties);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
