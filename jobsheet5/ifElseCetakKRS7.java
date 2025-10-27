package jobsheet5;

import java.util.Scanner;

public class ifElseCetakKRS7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int Semester;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukkan semester saat ini");
        Semester = sc.nextInt();

        if (Semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if (Semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if (Semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if (Semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if(Semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if(Semester == 6) {
            System.out.println("KRS semester 6 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if(Semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else if(Semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}
