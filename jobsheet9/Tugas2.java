package jobsheet9;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        System.out.println("\n---Masukkan Detail Pesanan---");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ":");

            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga (Rp): ");
            hargaPesanan[i] = sc.nextInt();
            totalBiaya += hargaPesanan[i];

            sc.nextLine();
        }

        System.out.println("\n==================================");
        System.out.println("Daftar Pesanan Anda");
        System.out.println("==================================");
        
        System.out.printf("%-5s | %-20s | %-10s\n", "No.", "Nama Pesanan", "Harga (Rp)");
        System.out.println("----------------------------------");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-5d | %-20s | %-10d\n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }
        
        System.out.println("----------------------------------");
        System.out.printf("%-28s | %-13d\n", "TOTAL HARGA", totalBiaya);

        sc.close();
    }
}
