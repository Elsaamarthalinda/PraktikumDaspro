package jobsheet11;
import java.util.Scanner;
public class Kubus7 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus (cm): ");
        
        if (sc.hasNextDouble()) {
            double sisi = sc.nextDouble();

            if (sisi > 0) {
                double volume = hitungVolume(sisi);
                double luasPermukaan = hitungLuasPermukaan(sisi);

                System.out.println("\n=== Hasil Perhitungan ===");
                System.out.printf("Sisi Kubus: %.0f cm%n", sisi);
                System.out.printf("Volume Kubus: %.0f cm%n", volume);
                System.out.printf("Luas Permukaan Kubus: %.0f cm²%n", luasPermukaan);
            } else {
                System.out.println("Panjang sisi harus bernilai positif.");
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }
    }
}