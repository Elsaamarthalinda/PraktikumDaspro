package jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        
        String[][] penonton = new String [4][2];

        while(true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                                System.out.println("\nNomor baris/kolom kursi tidak tersedia.");
                                System.out.println("Harap masukkan baris/kolom yang benar.");
                                continue;
                            }
                            
                            if (penonton[baris-1][kolom-1] != null) {
                                System.out.println("\nKursi B" + baris + "K" + kolom + " sudah terisi oleh " + penonton[baris-1][kolom-1] + ".");
                                System.out.println("Silakan masukkan nomor baris dan kolom yang lain.");
                                continue;
                            }
                            break; 
                        }

                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton " + nama + " berhasil disimpan di Baris " + baris + " Kolom " + kolom + ".");

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- Tampilan Matriks Kursi ---");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j];
                            if (namaPenonton == null) {
                                namaPenonton = "***";
                            }
                            System.out.print(namaPenonton + "\t");
                        }
                        System.out.println();
                    }
                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    boolean exit = true;
            }
        }
    }
}