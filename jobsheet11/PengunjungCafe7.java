package jobsheet11;
import java.util.Scanner;
public class PengunjungCafe7 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama pengunjung:");
        for(int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- "+namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");

        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
