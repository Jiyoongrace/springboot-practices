package ex04;

/* Spring Boot Test Integration
 *
 */

import ex04.component.MyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MyApplicationTest {
    @Autowired
    private MyComponent myComponent;
    // MyApplication에서 @Configuration으로 명시하면 @SpringBootTest에서는 인식 못함
    // MyApplication : @Configuration -> @SpringBootConfiguration

    @Test
    public void testMyComponentNotNull() {
        assertNotNull(myComponent);
    }
}
