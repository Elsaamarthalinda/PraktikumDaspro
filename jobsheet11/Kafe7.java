package jobsheet11;
import java.util.Scanner;
public class Kafe7 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        return (double) hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true);

        double totalKeseluruhan = 0.0;
        boolean isMember = true;
        boolean pesanLagi = true;

        System.out.println("===== SILAHKAN PILIH MENU =====");
        
        while (pesanLagi) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            double hargaItemSekarang = hitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += hargaItemSekarang;

            System.out.printf("Total pesanan ini: Rp %,.0f\n", hargaItemSekarang);
            System.out.print("Pesan menu lain? (y/n): ");
            sc.nextLine();
            String jawaban = sc.nextLine();

            if(jawaban.equalsIgnoreCase("n")) {
                pesanLagi = false;
            }
        }
        
        System.out.print("Masukkan kode promo (DISKON50/DISKON30/kosong): ");
        String kodePromo = sc.nextLine();

        double diskon = 0.0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalKeseluruhan * 0.50;
            System.out.printf("\nDISCOUNT APPLIED: 50%% (Rp %,.0f)\n", diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = totalKeseluruhan * 0.30;
            System.out.printf("\nDISCOUNT APPLIED: 30%% (Rp %,.0f)\n", diskon);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("\nKode promo " + kodePromo + " invalid atau tidak berlaku. Tidak ada diskon.");
        }

        if (isMember) {
            double diskonMember = (totalKeseluruhan - diskon) * 0.10; 
            diskon += diskonMember;
            System.out.printf("MEMBER DISCOUNT (10%%): Rp %,.0f\n", diskonMember);
        }


        double totalBayar = totalKeseluruhan - diskon;
        System.out.println("\n--------------------------------------------");
        System.out.printf("Total Harga Awal\t: Rp %,.0f\n", totalKeseluruhan);
        System.out.printf("Total Potongan Diskon\t: Rp %,.0f\n", diskon);
        System.out.printf("Total Yang Harus Dibayar\t: Rp %,.0f\n", totalBayar);
    }
}
