package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

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
        }
    }
}
