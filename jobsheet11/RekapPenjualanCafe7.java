package jobsheet11;
import java.util.Scanner;
class RekapPenjualanCafe7 {

    private static final String[] NAMA_MENU = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    private static final int JUMLAH_HARI_DEFAULT = 7;
    private static final int JUMLAH_MENU_DEFAULT = 5;

    public static int[][] inputDataPenjualan(Scanner sc, int jmlMenu, int jmlHari) {
        int[][] penjualan = new int[jmlMenu][jmlHari]; 

        if (jmlMenu == JUMLAH_MENU_DEFAULT && jmlHari == JUMLAH_HARI_DEFAULT) {
            return new int[][]{
                {20, 20, 25, 20, 10, 60, 10},
                {30, 80, 40, 10, 15, 20, 25},
                {5, 9, 20, 25, 10, 5, 45},
                {50, 8, 17, 18, 10, 30, 6},
                {15, 10, 16, 15, 10, 10, 55}
            };
        }

        System.out.println("--- Input Data Penjualan Harian ---");
        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("Menu: " + NAMA_MENU[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Penjualan Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        return penjualan;
    }

    public static void tampilkanTabel(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n=== DATA PENJUALAN ===");
        
        System.out.printf("%-15s", "Menu");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.printf("%-10s", "Hari " + (j + 1));
        }
        System.out.println("\n--------------------------------------------------------------------------------");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilkanPenjualanTertinggi(int[][] penjualan, String[] namaMenu) {
        int indexTertinggi = -1;
        int totalTertinggi = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            int totalMenu = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalMenu += penjualan[i][j];
            }
            
            if (totalMenu > totalTertinggi) {
                totalTertinggi = totalMenu;
                indexTertinggi = i;
            }
        }
        
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        if (indexTertinggi != -1) {
            System.out.println("Menu: " + namaMenu[indexTertinggi]);
            System.out.println("Total Penjualan (7 Hari): " + totalTertinggi);
        }
    }

    public static void tampilkanRataRata(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        int jmlHari = penjualan[0].length;
        
        for (int i = 0; i < penjualan.length; i++) {
            double totalMenu = 0;
            for (int j = 0; j < jmlHari; j++) {
                totalMenu += penjualan[i][j];
            }
            double rataRata = totalMenu / jmlHari;
            System.out.printf("%-15s: %.0f per-hari%n", namaMenu[i], rataRata);
        }
    }

    public static void main(String[] args) {
        String[] menu = NAMA_MENU;
        int[][] dataPenjualan = inputDataPenjualan(new Scanner(System.in), JUMLAH_MENU_DEFAULT, JUMLAH_HARI_DEFAULT);
        
        tampilkanTabel(dataPenjualan, menu);
        tampilkanPenjualanTertinggi(dataPenjualan, menu);
        tampilkanRataRata(dataPenjualan, menu);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah menu: ");
        int jmlMenuBaru = sc.nextInt();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jmlHariBaru = sc.nextInt();
        sc.nextLine();
        
        String[] menuBaru = new String[jmlMenuBaru];
        for (int i = 0; i < jmlMenuBaru; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menuBaru[i] = sc.nextLine();
        }
        
        int[][] dataPenjualanBaru = inputDataPenjualan(sc, jmlMenuBaru, jmlHariBaru);
        tampilkanTabel(dataPenjualanBaru, menuBaru);
        tampilkanPenjualanTertinggi(dataPenjualanBaru, menuBaru);
        tampilkanRataRata(dataPenjualanBaru, menuBaru);
        sc.close();
    }
}