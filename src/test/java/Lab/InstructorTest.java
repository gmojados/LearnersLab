package Lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor i1;

    @BeforeEach
    void setUp(){
       i1 = new Instructor(1, "Mrs.Jackson");
    }

    @Test
    void testImplementation (){
        //then
        Assertions.assertTrue(i1 instanceof Teacher);
    }
    @Test
    void testInheritance(){
        //then
        Assertions.assertTrue(i1 instanceof Person);

    }
    @Test
    void testTeach(){
        Student student1 = new Student(1,"Mike Jones");

        i1.teach(student1, 2.0);

        double updatedTime = student1.getTotalStudyTime();
        Assertions.assertEquals(2.0, updatedTime);
    }
    @Test
    void testLecture (){
        Student s1 = new Student(1, "Mike Jones");
        Student s2 = new Student(2,"Ice Spice");

        Learner[] learners = {s1,s2};

        i1.lecture(learners,2.0);

        Assertions.assertEquals(1.0,s1.getTotalStudyTime());
        Assertions.assertEquals(1.0,s2.getTotalStudyTime());
    }

}