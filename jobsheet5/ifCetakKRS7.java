package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean uktLunas;
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverivikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }else {
            System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        }
    }
}
