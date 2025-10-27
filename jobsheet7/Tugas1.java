package jobsheet7;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket;
        double tiket = 50000, diskon;

        do {
            System.out.print("Masukkan jumlah tiket (ketik 'batal' silahkan masukkan lagi): ");
            total;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
                break;
            
            double totalTiket = tiket * diskon;
            double totalHarga = tiket - jumlahTiket;
    
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua pesanan dibatalkan");
    }
}
