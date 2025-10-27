package jobsheet7;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tiket = 50000, totalTiket = 0, jmlTiket;
        double totalPenjualan = 0, diskon, total;

        System.out.println("Harga per tiket: Rp 50.000");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Input ulang!");
            continue;
            }

            diskon = 0;
            if (jmlTiket > 10)
            diskon = 0.15;
            else if (jmlTiket > 4)
            diskon = 0.10;

            total = jmlTiket * tiket * (1 - diskon);
            totalPenjualan += total;
            totalTiket += jmlTiket;

            System.out.println("\n--------------------- LAPORAN PENJUALAN ---------------------");
            System.out.println("Total tiket terjual: " + totalTiket);
            System.out.println("Total pendapatan  : Rp " + totalPenjualan);

            System.out.println("Total harga: Rp " + total);
        }
    }
}