package jobsheet9;
import java.util.Scanner;
import java.util.Arrays;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int nilai = sc.nextInt();

        if (nilai <= 0) {
            System.out.println("Banyaknya nilai harus lebih dari 0.");
            return;
        }

        int[] nilaiMahasiswa = new int[nilai];
        int totalNilai = 0;
        int nilaiTertinggi = -1;
        int nilaiTerendah = 101;

        System.out.println("--- Memasukkan Nilai ---");
        
        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " (bilangan bulat): ");
            int nilaiMhs = sc.nextInt();
            nilaiMahasiswa[i] = nilaiMhs;
            
            totalNilai += nilaiMhs;
            
            if (nilaiMhs > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs;
            }
            if (nilaiMhs < nilaiTerendah) {
                nilaiTerendah = nilaiMhs;
            }
        }
        
        System.out.println("\n--- Hasil Analisis Nilai ---");

        double rataRata = (double) totalNilai / nilai;

        System.out.printf("Nilai Rata-rata: %.2f\n", rataRata);

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);

        System.out.println("Daftar Semua Nilai: " + Arrays.toString(nilaiMahasiswa));

        sc.close();
    }
}
