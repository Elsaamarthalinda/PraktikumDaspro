package jobsheet8;
import java.util.Scanner;
public class NilaiKelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        double totalNilai, rataNilai;

        i = 1;
        while (1 <= 6) {
            System.out.println("Kelompok " + i);
        
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilaian " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++;
        }
    }
}