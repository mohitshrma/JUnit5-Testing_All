package net.testGuides.assertions;

import net.testGuides.Student;
import net.testGuides.StudentNotFoundException;
import net.testGuides.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest()
    {
        StudentService studentService = new StudentService();

        Student student = new Student(101,"Ram");

        List<Student> listOfStudents = studentService.getStudents();
        listOfStudents.add(student);

        boolean actualResult = listOfStudents.isEmpty();

        // assertTrue(actualResult);

        // assertTrue(() -> actualResult); //supports java 8 feature[lambda, and other]

        //   assertTrue(actualResult,"List of students is empty");

        //   assertTrue(() -> actualResult, "List of students is empty.");

        //    assertTrue(actualResult,() -> "list of students is empty!");

        //    assertTrue(() -> actualResult, ()-> "List of students is empty!");

//
//        JUnit 5 provides multiple versions of assertTrue:
//            - assertTrue(boolean condition): Fails if condition is false.
//            - assertTrue(boolean condition, String message): Fails if condition is false, displaying the provided message.
//            - assertTrue(boolean condition, Supplier<String> messageSupplier): Uses a supplier for lazy evaluation of the failure message.
//            - assertTrue(BooleanSupplier booleanSupplier): Accepts a BooleanSupplier for dynamic conditions.
//            - assertTrue(BooleanSupplier booleanSupplier, String message): Similar to the previous, but with a failure message.
//            - assertTrue(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier): Uses a supplier for lazy evaluation.

    }

        @Test
        public void getStudentsTestUsingAssertFalse()
        {
            StudentService studentService = new StudentService();

            Student st = new Student(202, "Alex");
            List<Student> studentList = studentService.getStudents();
            //studentService.addStudent(st);

            boolean actualResult = studentList.isEmpty();

           //   assertFalse(actualResult);

           //   assertFalse(actualResult, "Student list should not be empty!");

           //    assertFalse(() -> actualResult, () -> "Student list should not be empty!");

            //   assertFalse(() -> actualResult);

            //    assertFalse(actualResult, () -> "Student List must not be empty!");


//            JUnit 5 provides multiple versions of assertFalse:
//                - assertFalse(boolean condition): Fails if condition is true.
//                - assertFalse(boolean condition, String message): Fails if condition is true, displaying the provided message.
//                - assertFalse(boolean condition, Supplier<String> messageSupplier): Uses a supplier for lazy evaluation of the failure message.
//                - assertFalse(BooleanSupplier booleanSupplier): Accepts a BooleanSupplier for dynamic conditions.
//                - assertFalse(BooleanSupplier booleanSupplier, String message): Similar to the previous, but with a failure message.
//                - assertFalse(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier): Uses a supplier for lazy evaluation.

        }

        @Test
        public void getStudentByIdTestUsingAssertNull()
        {
            StudentService studentService = new StudentService();
            Student student = new Student(1,"Mohit");
            studentService.addStudent(student);

            Student actualObject = studentService.getStudentById(1);

            // assertNull(actualObject);

           // assertNull(actualObject, "Student object is not null!");

           // assertNull(actualObject,() -> "Student object is not null!");

        }

        @Test
        public void getStudentByIdTestUsingAssertNotNull()
        {
            StudentService studentService = new StudentService();
            Student student = new Student(1,"Mohit");
            studentService.addStudent(student);

            Student actualObject = studentService.getStudentById(1);

           // assertNotNull(actualObject);

           // assertNotNull(actualObject, "Student object is null");

           // assertNotNull(actualObject, ()-> "Student object is null");
        }


        @Test
        public void getStudentByIdTestUsingAssertEquals()
        {
            StudentService studentService = new StudentService();

            Student student = new Student(1,"Mohit");
            studentService.addStudent(student);

            Student actualObject = studentService.getStudentById(1);

            assertEquals(1,actualObject.getId());
            assertEquals("Mohit", actualObject.getName());

           //  assertEquals(student,actualObject);

           // assertEquals(1,actualObject.getId(),"Student Id is not equal");

          //  assertEquals("Mohit", actualObject.getName(), ()-> "Student name is not equal");
        }


        @Test
        public void getStudentByIdTestUsingAssertNotEquals()
        {
            StudentService studentService = new StudentService();

            Student student = new Student(1,"Mohit");
            studentService.addStudent(student);

            Student actualObject = studentService.getStudentById(1);

           //  assertNotEquals(2, actualObject.getId());

            //   assertNotEquals("Ram", actualObject.getName(), "Student name are equal");

           // assertNotEquals(2, actualObject.getId(), () -> "Student id are equal");

           // assertNotEquals(student, actualObject);

        }


        @Test
        public void getStudentByNameTestUsingAssertThrows()
        {
            StudentService studentService = new StudentService();

            Student student = new Student(1,"Mohit");

            studentService.addStudent(student);

//            assertThrows(StudentNotFoundException.class, () -> {
//               studentService.getStudentByName("Umesh");
//            });

//            assertThrows(StudentNotFoundException.class, () -> {
//                studentService.getStudentByName("Umesh");
//            }, "Student not found exception should be thrown but it was not");

            assertThrows(RuntimeException.class, () -> {
                studentService.getStudentByName("Mohit");
            }, () -> "StudentNotFoundException should be thrown.But it wasn't");
         }

}


/*
In JUnit 5, assertThrows is used to verify that a specific exception is thrown during the execution of a test.
It has different variations depending on the parameters passed.
Variations of assertThrows
- Basic Usage – Pass the expected exception class and a lambda expression:
    assertThrows(IllegalArgumentException.class, () -> {
    throw new IllegalArgumentException("Invalid argument");
});

- Capturing the Exception – Store the thrown exception and verify its message:
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
    throw new IllegalArgumentException("Invalid argument");
    });


 */