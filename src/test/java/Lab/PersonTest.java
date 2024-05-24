package Lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void testConstructor () {
    Person person = new Person(0L,"Jamie");
    String actual = person.getName();
    String expected = "Jamie";
    long ex = 0L;
    long act = person.getID();

        Assertions.assertEquals(expected,actual);
        Assertions.assertEquals(ex,act);

    }
    @Test
    void testSetName(){

    }

}