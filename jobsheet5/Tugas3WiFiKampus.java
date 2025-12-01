package jobsheet5;

import java.util.Scanner;

public class Tugas3WiFiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Pengecekan WiFi Kampus ---");
        System.out.println("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int Jmlsks = sc.nextInt();
            if (Jmlsks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
            
        } else {
            System.out.println("Akses di tolak");
        }
        sc.close();
    }
}