package ex01;

/* Spring Boot Test Integration
 *
 * Error:
 * Spring Boot Test Integration(@SpringBootTest) 에서는
 * @Configuration을 달고 있는 설정 클래스를 스캔하지 못한다.
 */

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MyApplicationTest02 {
    @Autowired
    private MyComponent myComponent;
    // MyApplication에서 @Configuration으로 명시하면 @SpringBootTest에서는 인식 못함
    // MyApplication : @Configuration -> @SpringBootConfiguration

    @Test
    public void testMyComponentNotNull() {
        assertNotNull(myComponent);
    }
}
