package helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age) {};
record Address (String firstLine, String city) {};


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name () {
        return "Morgan";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person () {
        return new Person("Lee", 28);
    }

    @Bean
    public Person person2MethodCall () {
        return new Person(name(), age());
    }

    @Bean
    public Person person3Parameters (String name, int age, Address address) {
        return new Person(name, age);
    }

    @Bean
    public Person person4Qualifier (String name, int age, @Qualifier("address2Qualifier") Address address) {
        return new Person(name, age);
    }

    @Bean
    @Primary
    public Address address() {
        return new Address("Backer Street", "London");
    }

    @Bean(name = "address2")
    @Qualifier("address2Qualifier")
    public Address address2() {
        return new Address("Backer Street", "London");
    }

}
