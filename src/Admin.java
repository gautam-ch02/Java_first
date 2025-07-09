public class Admin extends User {

    //Admin constructor
     public Admin(String id, String name) {
        super(id, name);
    }

    //methods
    public void addCourse(CourseCatalog catalog, Course course) {
        catalog.addCourse(course);
    }

    public void removeCourse(CourseCatalog catalog, String courseId) {
        catalog.removeCourse(courseId);
    }

    @Override
    public void homeScreen() {
        System.out.println("Admin Options: \n 1. Add Course \n  2. Remove Course \n 3. Logout \n");
    }
}
