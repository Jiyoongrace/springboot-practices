package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 메타 어노테이션(여러 어노테이션이 합쳐져 있는 것)
// @SpringBootApplication

// @Configuration -> Spring Test Integration
// @SpringBootApplication -> Spring Boot Test Integration
@SpringBootConfiguration
public class MyApplication {
    @Bean
    public MyComponent myComponent() {
        return new MyComponent();
    }

    public static void main(String[] args) {
        try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
            MyComponent myComponent = ac.getBean(MyComponent.class);
            System.out.println(myComponent); // ex01.MyComponent@5c48c0c0
        }
    }
}
