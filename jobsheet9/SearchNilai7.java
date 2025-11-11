package jobsheet9;
import java.util.Scanner;
public class SearchNilai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
    }
}
