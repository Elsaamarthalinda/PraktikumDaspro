package COBA;

import java.util.Arrays;

public class Academy {

    private String name;
    private Course[] courses = new Course[20];
    private int courseCount = 0;
    private Student[] students = new Student[10];
    private int studentCount = 0;

    public Academy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addCourse(Course course) {
        if (course == null || courseCount >= 20) {
            return false;
        }
        courses[courseCount] = course;
        courseCount++;
        return true;
    }

    public boolean addStudent(Student student) {
        if (student == null || studentCount >= 10) {
            return false;
        }
        if (findStudent(student.getStudentId()) != null) {
            return false;
        }
        students[studentCount] = student;
        studentCount++;
        return true;
    }

    public Course[] getCourses() {
        return Arrays.copyOf(courses, courseCount);
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, studentCount);
    }

    public Course findCourseByTitle(String title) {
        if (title == null) {
            return null;
        }
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getTitle().equalsIgnoreCase(title.trim())) {
                return courses[i];
            }
        }
        return null;
    }

    public Student findStudent(String studentId) {
        if (studentId == null) {
            return null;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(studentId.trim())) {
                return students[i];
            }
        }
        return null;
    }

    public Course[] searchByKeyword(String keyword) {
        if (keyword == null) {
            return new Course[0];
        }
        Course[] temp = new Course[courseCount];
        int count = 0;
        String lowerKeyword = keyword.toLowerCase();
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getTitle().toLowerCase().contains(lowerKeyword)) {
                temp[count] = courses[i];
                count++;
            }
        }
        return Arrays.copyOf(temp, count);
    }

    public boolean enroll(String studentId, String title) {
        Student student = findStudent(studentId);
        Course course = findCourseByTitle(title);

        if (student == null || course == null) {
            return false;
        }

        if (!student.canEnroll() || !course.isAvailable()) {
            return false;
        }

        if (course.takeSeat()) {
            if (student.addEnrollment()) {
                return true;
            } else {
                course.releaseSeat();
                return false;
            }
        }
        return false;
    }

    public boolean drop(String studentId, String title) {
        Student student = findStudent(studentId);
        Course course = findCourseByTitle(title);

        if (student == null || course == null) {
            return false;
        }

        if (course.isAvailable() || student.getCourseCount() <= 0) {
            return false;
        }

        course.releaseSeat();
        if (student.removeEnrollment()) {
            return true;
        } else {
            course.takeSeat();
            return false;
        }
    }
}