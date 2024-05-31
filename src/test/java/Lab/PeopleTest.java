package Lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeopleTest {
    People people;
    Person person1;
    Person person2;


    @BeforeEach
    void setUP() { //given
        people = new People();
        person1 = new Person(1, "Mike");
        person2 = new Person(2, "Travis");
    }

    @Test
    void testAdd() {
        people.add(person1);
        people.add(person2);
        //then
        Assertions.assertEquals(2, people.count());
    }

    @Test
    void testRemove() {
        //given
        people.add(person1);
        people.add(person2);
        //when
        people.remove(person1);
        // then
        Assertions.assertEquals(1, people.count());
    }

    @Test
    void testFindById() {
        people.add(person1);
        people.add(person2);
        // when
        Person foundPerson1 = people.findById(person1.getId());
        // then
        Assertions.assertEquals(person1, foundPerson1);
    }
}
