package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// 메타 어노테이션(여러 어노테이션이 합쳐져 있는 것)
// @SpringBootApplication

// @Configuration -> Spring Test Integration
// @SpringBootApplication -> Spring Boot Test Integration

// @SpringBootApplication 메타 어노테이션

// + @SpringBootConfiguration : ex01, ex02
// + @ComponentScan : 패키지 ex04를 포함, 하부 패키지를 스캔한다. ex) ex03
// + @EnableAutoConfiguration :
// 1. MVC, Aspect(AOP), Security, JPA 등을 자동으로 설정
// 2. 발견된 Starter Dependency(Library)기반으로 설정(관례를 따르는 default 설정)
// 3. application.properties or application.yml 안에 미세 설정 (필수)
// 4. Spring Boot의 Auto Configuration이나 미세 설정 이외의 설정은 Java 설정을 한다.

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
        }
    }
}
