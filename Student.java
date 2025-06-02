import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Course> courses; // List of courses the student is taking

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Add the student to the course as well
    }

    public void showStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled in Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}
