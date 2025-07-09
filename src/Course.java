import java.util.*;

public class Course {

    //every course's attributes
    private String courseId;
    private String name;
    private int maxCapacity;

    private final List<Student> enrolled; //every course will have own list of students enrolled and waitlisted
    private final Queue<Student> waitlist;

    //Course constructor
    public Course(String courseId, String name, int maxCapacity) {
        this.courseId = courseId;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolled = new ArrayList<>();
        this.waitlist = new LinkedList<>();
    }

    //methods
    //THREAD SAFE 
    public synchronized boolean enroll(Student s) {
        if (enrolled.contains(s)) {
            System.out.println(s.getName() + " is already enrolled.");
            return true;
        }

        if (enrolled.size() < maxCapacity) {
            enrolled.add(s);
            System.out.println(s.getName() + " successfully enrolled in " + name);
            return true;
        } else {
            waitlist.add(s);
            System.out.println(s.getName() + " added to waitlist for " + name);
            return false;
        }
    }

    public synchronized void drop(Student s) {
        //if student is enrolled
        if (enrolled.remove(s)) {
            System.out.println(s.getName() + " dropped from " + name);
            //promote someone from waitlist(if any)
            if (!waitlist.isEmpty()) {
                Student next = waitlist.poll();
                enrolled.add(next);
                System.out.println(next.getName() + " moved from waitlist to enrolled.");
            }
        } 
        // if student is waitlisted
        else if (waitlist.contains(s)) {
        waitlist.remove(s);
        System.out.println(s.getName() + " removed from waitlist of " + name);
        }
        //if neither
        else {
           System.out.println(s.getName() + " is not enrolled or waitlisted in " + name);
        }
    }

    //getter and setter
    public String getName() {
        return name;
    }
    public String getcourseId() {
        return courseId;
    }

}
