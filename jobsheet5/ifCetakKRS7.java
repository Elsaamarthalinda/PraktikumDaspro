package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean uktLunas;
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? ("Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA") : ("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");

        System.out.println(pesan);
        }
    }

