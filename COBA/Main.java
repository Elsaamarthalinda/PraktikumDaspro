package COBA;

import java.util.Scanner;

/**
 * Titik awal program (satu-satunya method main di proyek ini).
 *
 * Bagian 1: baris PERTAMA output harus persis "Welcome to Polinema Academy".
 * Setelah itu kamu bebas menambah baris lain untuk bereksperimen.
 *
 * Bagian 7: di bawah baris sapaan, kamu akan membuat Academy, mengisi data
 * contoh, lalu menjalankan AcademyApp. Kerangkanya ada di README.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Polinema Academy");

        Academy academy = new Academy("Polinema Academy");

        Instructor instructor = new Instructor("Dewi Lestari", "Software Engineering");
        OnlineCourse onlineCourse = new OnlineCourse("OOP-101", "Java Basics", 2023, instructor);
        OfflineCourse offlineCourse = new OfflineCourse("Database Systems", 2021, "R-204");
        Workshop workshop = new Workshop("Git Bootcamp", 2024, 30);
        Student student = new Student("S101", "Rina");

        academy.addCourse(onlineCourse);
        academy.addCourse(offlineCourse);
        academy.addCourse(workshop);
        academy.addStudent(student);

        AcademyApp app = new AcademyApp(academy, new Scanner(System.in), System.out);
        app.run();
    }
}