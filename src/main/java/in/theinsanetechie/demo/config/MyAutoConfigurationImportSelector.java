package in.theinsanetechie.demo.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigurationImportSelector implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "in.theinsanetechie.demo.config.TomcatConfiguration",
                "in.theinsanetechie.demo.config.DispatcherServletConfiguration",
                "in.theinsanetechie.demo.config.MvcConfiguration"
        };
    }
}
