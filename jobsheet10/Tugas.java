package jobsheet10;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        System.out.println("=== PROGRAM SURVEY KEPUASAN PELANGGAN ===");
        System.out.println("Masukkan nilai 1 - 5 untuk setiap pertanyaan.");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < responden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < pertanyaan; j++) {

                while (true) {
                    System.out.print("Nilai pertanyaan " + (j + 1) + ": ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        survey[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai harus antara 1 - 5!");
                    }
                }
            }
        }

        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (int i = 0; i < responden; i++) {
            int jumlah = 0;
            for (int j = 0; j < pertanyaan; j++) {
                jumlah += survey[i][j];
            }
            double rata = (double) jumlah / pertanyaan;
            System.out.printf("Responden %d : %.2f%n", (i + 1), rata);
        }

        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < pertanyaan; j++) {
            int jumlah = 0;
            for (int i = 0; i < responden; i++) {
                jumlah += survey[i][j];
            }
            double rata = (double) jumlah / responden;
            System.out.printf("Pertanyaan %d : %.2f%n", (j + 1), rata);
        }

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int total = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) total / (responden * pertanyaan);
        System.out.printf("Rata-rata keseluruhan: %.2f%n", rataKeseluruhan);

    }
    
}