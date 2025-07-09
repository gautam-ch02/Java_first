import java.util.*;
//follows Singleton design pattern

public class CourseCatalog {

    //ensures only 1 instance
    private static CourseCatalog instance;
    
    private final Map<String, Course> existing_courses;

    //private constructor
    private CourseCatalog() {
        existing_courses = new HashMap<>();
    }

    //Global access point 
     public static synchronized CourseCatalog getInstance() {
        if (instance == null) {
            instance = new CourseCatalog();
        }
        return instance;
    }


    //methods
    public void addCourse(Course course) {
        existing_courses.put(course.getcourseId(), course);
    }

    public void removeCourse(String courseId) {
        existing_courses.remove(courseId); //"existing_courses" is the map of courses inside the catalog class
    }

    public Course getCourseById(String courseId) {
        return existing_courses.get(courseId);
    }

    public void listCourses() {
        for (Course c : existing_courses.values()) {
            System.out.println(c.getName());
        }
    }
}
