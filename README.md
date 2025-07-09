# Java_first
Java Projects
# 🎓 Smart Course Enrollment System (Java Console App)

A robust and interactive **course enrollment system** built using **Object-Oriented Programming** in Java.  
This console-based application allows students to enroll in, drop, and view courses — including smart waitlist handling and admin functionalities.

---

## 📌 Features

### 👨‍🎓 Student Features
- Enroll in courses (automatically waitlisted if course is full)
- Drop enrolled or waitlisted courses
- View enrolled and waitlisted course lists
- Menu-driven interface with input prompts

### 👨‍🏫 Admin Features *(Coming soon or in progress)*
- Add or remove courses from the catalog
- View all available courses
- Centralized catalog access

### ⚙️ Course Management
- Waitlist implemented using `Queue`
- Capacity checks and auto-promotion from waitlist
- Thread-safe enroll/drop methods with `synchronized`

---

## 💡 Key Concepts Used

- ✅ **Object-Oriented Design**  
  Classes: `User` (abstract), `Student`, `Admin`, `Course`, `CourseCatalog`

- ✅ **Encapsulation & Abstraction**  
  Proper use of getters/setters, and abstraction via interfaces and abstract classes

- ✅ **Multithreading-safe operations**  
  `synchronized` methods in `Course` for enrollment and dropping

- ✅ **Collections API**  
  Used `List`, `Queue`, `ArrayList`, `LinkedList`, and `HashMap`

---

## 📁 Project Structure

