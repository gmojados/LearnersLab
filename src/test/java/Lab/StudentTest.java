package Lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp(){
        //given
        student = new Student(1, "Tom");
    }


    @Test
    void TestImplementation(){

        Assertions.assertTrue(student instanceof Learner);
    }
    @Test
    void testInheritance (){

        Assertions.assertTrue(student instanceof Person);
    }
    @Test
    void testLearn (){
        //when
        double currentStudy = student.getTotalStudyTime();
        student.learn(2);
        double expectedTime = 2;
        double actual = student.getTotalStudyTime();
        Assertions.assertEquals(expectedTime,actual);

        //then
    }

}