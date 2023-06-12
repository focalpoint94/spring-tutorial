package helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // Launch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

            // Configure the things that we want Spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name method - @Bean

            // Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person4Qualifier"));

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        };

    }
}
