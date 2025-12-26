# Learning Management System (LMS) Project

## Project Overview
This is a Java-based Learning Management System that manages users, courses, and quizzes using a JSON-based data structure. The project allows for different user roles (Student, Admin, Instructor) and tracks course progress and quiz attempts.

## Data Structure
The system relies on the following data components:

### 1. Users
Manages authentication and roles.
* **Roles:** Student, Admin, Instructor.
* **Sample Users:** `dad` (Student), `ahmed elsayed` (Instructor), `moaz elsayed` (Admin).
* **Key Fields:** `enrolledCourses`, `progress`, `passwordHash`.

### 2. Courses
Contains course metadata and content.
* **Courses Included:**
    * *Statistics* (ID: C32846)
    * *Programming 2 (OOP)* (ID: C85814) - Focuses on Java OOP concepts.
    * *Digital 2* (ID: C92010) - Covers Flip-flops and digital logic.
* **Structure:** Courses contain `lessons`, which contain `quizzes`.

### 3. Quizzes & Attempts
Tracks student performance.
* **Quizzes:** Covers topics like "OOP", "Inheritance", and "Flip-flops".
* **Attempts:** Logs the student's selected answers, score, and pass/fail status.

## Technical Details
* **Language:** Java
* **Build System:** Ant (using `build.xml`)
* **Data Storage:** JSON Files
