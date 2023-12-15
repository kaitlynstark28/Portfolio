package StaticKeyword;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {
    private MyClass instance1;
    private MyClass instance2;

    @BeforeEach
    public void setUp() {
        instance1 = new MyClass(1, 2.5, "Instance 1");
        instance2 = new MyClass(3, 4.0, "Instance 2");
    }

    @Test
    public void testInstanceCount() {
        int count = MyClass.getInstanceCount();
        assertEquals(2, count);
    }
}
