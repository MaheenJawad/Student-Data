import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    List<Student> students; // List of students enrolled in this course

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}
