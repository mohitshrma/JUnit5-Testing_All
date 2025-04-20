package net.testGuides;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> studentList = new ArrayList<Student>();

    public List<Student> getStudents()
    {
        return this.studentList;
    }

    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    public Student getStudentById(int studentId)
    {
       return studentList.stream()
                .filter((student -> student.getId() == studentId))
                .findFirst()
                .orElse(null);
    }

    public Student getStudentByName(String name)
    {
       return studentList.stream()
                .filter((student) -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student not found with given name: " + name));
    }

}
