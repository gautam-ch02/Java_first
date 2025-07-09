# Java_first
Java Projects
Console Based Smart Course Enrollment System using OOP Principles and Multithreading

An interactive course enrollment system built using Object-Oriented Programming concepts in Java.  
This console-based application allows students to enroll in, drop, and view courses — including smart waitlist handling using Multithreading and admin functionalities.

---

Features:

1. Student Features
- Enroll in courses (automatically waitlisted if course is full)
- Drop enrolled or waitlisted courses
- View enrolled and waitlisted course lists
- Menu-driven interface with input prompts

2. Admin Features
- Add or remove courses from the catalog
- View all available courses
- Centralized catalog access

3. Course Management
- Waitlist implemented using `Queue`
- Capacity checks and auto-promotion from waitlist
- Thread-safe enroll/drop methods with `synchronized`



Key Concepts Used:

1.Object-Oriented Design  
  Classes: `User` (abstract), `Student`, `Admin`, `Course`, `CourseCatalog`

2.Encapsulation & Abstraction
  Proper use of getters/setters, and abstraction via interfaces and abstract classes

3.Multithreading-safe operations  
  `synchronized` methods in `Course` for enrollment and dropping

4.Collections API  
  Used `List`, `Queue`, `ArrayList`, `LinkedList`, and `HashMap`
