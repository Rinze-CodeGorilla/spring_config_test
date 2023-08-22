package com.example.spring_config_test;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
@Conditional(AppConfig.DemoCondition.class)
public class AppConfig {

    @Bean
    @Conditional(ProductionImplementation.class)
    public PWGen getHardGenerator() {
        return new HardGen();
    }

    @Bean
    @Conditional(DemoImplementation.class)
    public PWGen getEasyGenerator() {
        return new EasyGen();
    }

    public AppConfig() {
        System.out.println("Starting AppConfig");
    }
    static class DemoCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return !"prod".equals(context.getEnvironment().getProperty("environment"));
        }
    }
}
