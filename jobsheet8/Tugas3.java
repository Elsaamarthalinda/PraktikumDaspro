package jobsheet8;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang, jumlahPelanggan;
        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item?: ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang" + i + " :");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelanggan += jumlahPelanggan;
            totalItem += totalItemCabang;
        }

        System.out.println("---- TOTAL SELURUH CABANG ----");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " +totalItem + " item");
    }
}
