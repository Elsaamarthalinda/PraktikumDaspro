package COBA;

import java.io.PrintStream;
import java.util.Scanner;

public class AcademyApp {

    private Academy academy;
    private Scanner in;
    private PrintStream out;

    public AcademyApp(Academy academy, Scanner in, PrintStream out) {
        this.academy = academy;
        this.in = in;
        this.out = out;
    }

    public void run() {
        while (true) {
            showMenu();
            out.print("Select: ");
            if (!in.hasNextLine()) {
                return;
            }
            String input = in.nextLine().trim();

            switch (input) {
                case "1": handleListCourses(); break;
                case "2": handleAddOnlineCourse(); break;
                case "3": handleAddOfflineCourse(); break;
                case "4": handleAddWorkshop(); break;
                case "5": handleRegisterStudent(); break;
                case "6": handleEnrollStudent(); break;
                case "7": handleDropCourse(); break;
                case "8": handleSearchCourses(); break;
                case "9": handleListStudents(); break;
                case "0":
                    out.println("Bye");
                    return;
                default:
                    out.println("Invalid option");
            }
        }
    }

    private void showMenu() {
        out.println("=== " + academy.getName() + " ===");
        out.println("1. List courses");
        out.println("2. Add online course");
        out.println("3. Add offline course");
        out.println("4. Add workshop");
        out.println("5. Register student");
        out.println("6. Enroll student");
        out.println("7. Drop course");
        out.println("8. Search courses");
        out.println("9. List students");
        out.println("0. Exit");
    }

    private String formatCourseLine(Course c) {
        String status = c.isAvailable() ? "Open" : "Full";
        return c.describe() + " | " + status + " | " + c.durationWeeks() + " weeks";
    }

    private void handleListCourses() {
        Course[] courses = academy.getCourses();
        if (courses.length == 0) {
            out.println("No courses");
        } else {
            for (Course c : courses) {
                out.println(formatCourseLine(c));
            }
        }
    }

    private void handleAddOnlineCourse() {
        out.print("Code: ");
        if (!in.hasNextLine()) return;
        String code = in.nextLine().trim();

        out.print("Title: ");
        if (!in.hasNextLine()) return;
        String title = in.nextLine().trim();

        out.print("Year: ");
        if (!in.hasNextLine()) return;
        String yearStr = in.nextLine().trim();
        int year = parseYear(yearStr);
        if (year < 2015) {
            out.println("Invalid number");
            return;
        }

        if (code.isEmpty() || title.isEmpty()) {
            out.println("Invalid input");
            return;
        }

        out.print("Instructor name (blank for none): ");
        if (!in.hasNextLine()) return;
        String instructorName = in.nextLine().trim();

        Instructor instructor = null;
        if (!instructorName.isEmpty()) {
            out.print("Instructor expertise: ");
            if (!in.hasNextLine()) return;
            String expertise = in.nextLine().trim();
            instructor = new Instructor(instructorName, expertise);
        }

        OnlineCourse course = new OnlineCourse(code, title, year, instructor);
        if (academy.addCourse(course)) {
            out.println("Course added");
        } else {
            out.println("Academy is full");
        }
    }

    private void handleAddOfflineCourse() {
        out.print("Title: ");
        if (!in.hasNextLine()) return;
        String title = in.nextLine().trim();

        out.print("Year: ");
        if (!in.hasNextLine()) return;
        String yearStr = in.nextLine().trim();

        out.print("Room: ");
        if (!in.hasNextLine()) return;
        String room = in.nextLine().trim();

        int year = parseYear(yearStr);
        if (year < 2015) {
            out.println("Invalid number");
            return;
        }

        if (title.isEmpty() || room.isEmpty()) {
            out.println("Invalid input");
            return;
        }

        OfflineCourse course = new OfflineCourse(title, year, room);
        if (academy.addCourse(course)) {
            out.println("Course added");
        } else {
            out.println("Academy is full");
        }
    }

    private void handleAddWorkshop() {
        out.print("Title: ");
        if (!in.hasNextLine()) return;
        String title = in.nextLine().trim();

        out.print("Year: ");
        if (!in.hasNextLine()) return;
        String yearStr = in.nextLine().trim();

        out.print("Seats: ");
        if (!in.hasNextLine()) return;
        String seatsStr = in.nextLine().trim();

        int year = parseYear(yearStr);
        int seats = parsePositiveInt(seatsStr);

        if (year < 2015 || seats <= 0) {
            out.println("Invalid number");
            return;
        }

        if (title.isEmpty()) {
            out.println("Invalid input");
            return;
        }

        Workshop workshop = new Workshop(title, year, seats);
        if (academy.addCourse(workshop)) {
            out.println("Course added");
        } else {
            out.println("Academy is full");
        }
    }

    private void handleRegisterStudent() {
        out.print("Student ID: ");
        if (!in.hasNextLine()) return;
        String studentId = in.nextLine().trim();

        out.print("Name: ");
        if (!in.hasNextLine()) return;
        String name = in.nextLine().trim();

        if (studentId.isEmpty() || name.isEmpty()) {
            out.println("Invalid input");
            return;
        }

        if (academy.findStudent(studentId) != null) {
            out.println("Student ID already exists");
            return;
        }

        Student student = new Student(studentId, name);
        if (academy.addStudent(student)) {
            out.println("Student registered");
        } else {
            out.println("Academy is full");
        }
    }

    private void handleEnrollStudent() {
        out.print("Student ID: ");
        if (!in.hasNextLine()) return;
        String studentId = in.nextLine().trim();

        out.print("Course title: ");
        if (!in.hasNextLine()) return;
        String title = in.nextLine().trim();

        if (academy.enroll(studentId, title)) {
            out.println("Enrollment successful");
        } else {
            out.println("Enrollment failed");
        }
    }

    private void handleDropCourse() {
        out.print("Student ID: ");
        if (!in.hasNextLine()) return;
        String studentId = in.nextLine().trim();

        out.print("Course title: ");
        if (!in.hasNextLine()) return;
        String title = in.nextLine().trim();

        if (academy.drop(studentId, title)) {
            out.println("Drop successful");
        } else {
            out.println("Drop failed");
        }
    }

    private void handleSearchCourses() {
        out.print("Keyword: ");
        if (!in.hasNextLine()) return;
        String keyword = in.nextLine().trim();

        Course[] results = academy.searchByKeyword(keyword);
        if (results.length == 0) {
            out.println("No courses found");
        } else {
            for (Course c : results) {
                out.println(formatCourseLine(c));
            }
        }
    }

    private void handleListStudents() {
        Student[] students = academy.getStudents();
        if (students.length == 0) {
            out.println("No students");
        } else {
            for (Student s : students) {
                out.println(s.getStudentId() + " - " + s.getName() + " (" + s.getCourseCount() + " of 3 courses)");
            }
        }
    }

    private int parseYear(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private int parsePositiveInt(String input) {
        try {
            int val = Integer.parseInt(input);
            return val > 0 ? val : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}