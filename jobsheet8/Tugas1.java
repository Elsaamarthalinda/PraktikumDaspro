package jobsheet8;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, jumlah;

        for (n = 1; n <= 5; n++) {
            jumlah = 0;
            System.out.print("n = " + n + " jumlah kuadrat = ");

            for (i = 1; i <= n; i++) {
                jumlah += i * i;
                System.out.print(i * i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}
