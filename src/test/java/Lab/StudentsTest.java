package Lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {


    @Test
    void getInstance() {
        Students instance = Students.getInstance();
        Students instance2 = Students.getInstance();

        Assertions.assertSame(instance,instance2);
    }
}