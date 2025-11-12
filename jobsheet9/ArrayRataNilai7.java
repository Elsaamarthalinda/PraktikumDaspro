package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");

        int[] nilaiMhs= new int [5];
        int lulus = 0, tdkLulus = 0;
        double ttlLulus = 0, ttlTdkLulus = 0;
        double rataLulus, rataTdkLls;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                ttlLulus += nilaiMhs[i];
                lulus++;
            } else {
                ttlTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        
        rataLulus = ttlLulus/lulus;
        rataTdkLls = ttlTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLls);
    }
}
