public class Main {
    public static void main(String[] args) {
        // Creating courses
        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");
        Course physics = new Course("Physics");

        // Creating students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Enrolling students in courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(cs);

        bob.enrollInCourse(cs);
        bob.enrollInCourse(physics);

        // Displaying student info
        alice.showStudentInfo();
        System.out.println();
        bob.showStudentInfo();
        System.out.println();

        // Displaying course info
        math.showCourseInfo();
        System.out.println();
        cs.showCourseInfo();
        System.out.println();
        physics.showCourseInfo();
    }
}
