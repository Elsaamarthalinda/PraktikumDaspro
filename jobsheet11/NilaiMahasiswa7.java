package jobsheet11;
import java.util.Scanner;
class NilaiMahasiswa {

    public static int[] isianArray(Scanner sc, int N) {
        int[] nilaiMhs = new int[N];
        System.out.println("--- Mengisi Nilai Mahasiswa ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        return nilaiMhs;
    }

    public static void tampilArray(int[] arrayNilai) {
        System.out.println("\n--- Daftar Nilai Mahasiswa ---");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }

    public static double hitTot(int[] arrayNilai) {
        double total = 0;
        for (int nilai : arrayNilai) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        int[] nilaiKelas = isianArray(sc, N);

        tampilArray(nilaiKelas);
        double totalNilai = hitTot(nilaiKelas);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Total nilai seluruh mahasiswa: %.2f%n", totalNilai);

    }
}