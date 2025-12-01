package jobsheet5;

import java.util.Scanner;

public class Tugas3SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean kartu, registrasiOnline;

        System.out.println("--- Sistem Perpustakaan Kampus---");
        System.out.println("Apakah mahasiswa membawa kartu (true/fasle): ");
        kartu = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sudah melakukan registrasi online? (true/false): ");
        registrasiOnline = sc.nextBoolean();

        if (kartu || registrasiOnline) {
            System.out.println("Mahasiswa boleh masuk");
        } else {
            System.out.println("Ditolak masuk");
        }
    }
}
