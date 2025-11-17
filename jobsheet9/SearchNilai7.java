package jobsheet9;
import java.util.Scanner;
public class SearchNilai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        
        int[] nilaiMhs = new int[jmlNilai];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
            } else {
                System.out.println("Nilai yang dicari tidak ditemukan");
            }
                break;
            }
        }
    }