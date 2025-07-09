public class App {
    public static void main(String[] args) throws Exception {

        CourseCatalog catalog = CourseCatalog.getInstance();

        Course cs101 = new Course("CS101", "Data Structures", 1);
        Course cs102 = new Course("CS102", "Operating Systems", 2);
        catalog.addCourse(cs101);
        catalog.addCourse(cs102);

        Student s1 = new Student("S01", "Gautam");
        Student s2 = new Student("S02", "Arjun");

        //multiple threads to enroll into classes
        Thread t1 = new Thread(() -> s1.enrollCourse(cs101));
        Thread t2 = new Thread(() -> s2.enrollCourse(cs101));

        t1.start();
        t2.start();

        s1.homeScreen();

    }
}
