import java.util.*;

public class Student extends User {
    //every student's attributes
    private final List<Course> enrolledCourses;
    private final List<Course> waitlistedCourses;

    //Student constructor
    public Student(String id, String name) {
        super(id, name);
        this.enrolledCourses = new ArrayList<>();
        this.waitlistedCourses = new ArrayList<>();
    }

    //methods
    public void enrollCourse(Course course) {
        boolean success= course.enroll(this); //"enroll" is a method of Course class
        if (success && !enrolledCourses.contains(course)) {
            enrolledCourses.add(course); 
        } else if (!success && !waitlistedCourses.contains(course)){
            waitlistedCourses.add(course);
        }
    }

    public void dropCourse(Course course) {
       if(enrolledCourses.contains(course)){
        course.drop(this); //remove from course list (course class ki): "drop" is a method of Course class
        enrolledCourses.remove(course); //remove from students list: CANNOT USE "THIS" here
       } 
       else if(waitlistedCourses.contains(course)){
        course.drop(this); //drop this student from waitlist of the course
        waitlistedCourses.remove(course);
       }
       else {
        System.out.println("You are neither enrolled nor waitlisted in this course");
       }
    }// used "drop()" method of Course class to drop student no matter if they were enrolled/waitlisted inside the courses, the course method auto takes care of that

    public void viewCourses() {
         if (enrolledCourses.isEmpty()) {
        System.out.println("You are not enrolled in any courses yet.");
        return;
    }
        System.out.println("Your enrolled courses:");
        for (Course c : enrolledCourses) {
            System.out.println(c.getName());
        }
    }

    @Override
    public void homeScreen() {
        System.out.println("Welcome Student!!");
        System.out.println("Student Options: \n 1. Enroll \n 2. Drop \n 3. View \n 4. Logout \n");
    }
    








}
