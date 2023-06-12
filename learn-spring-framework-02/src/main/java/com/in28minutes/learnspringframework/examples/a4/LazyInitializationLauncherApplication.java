package com.in28minutes.learnspringframework.examples.a4;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass {

    private SomeDependency somedependency;

    public SomeClass(SomeDependency somedependency) {
        super();
        this.somedependency = somedependency;
        System.out.println("Dependency is ready");
    }

    @PostConstruct
    public void initialize() {
        somedependency.getReady();
    }

}


@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Logic in dep");
    }
}



@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        };

    }

}
