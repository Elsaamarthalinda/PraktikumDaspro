package jobsheet9;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("Daftar Menu Tersedia: " + String.join(", ", menu));

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String makanan = sc.nextLine();
        
        String cariMakanan = makanan.trim();
        
        int a = -1;
        
        System.out.println("\n--- Proses Pencarian (Linear Search) ---");
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMakanan)) {
                a = i;
                break;
            }
        }
        
        if (a != -1) {
            System.out.println("Makanan/Minuman '" + cariMakanan + "' tersedia di menu (pada indeks ke-" + a + ").");
        } else {
            System.out.println("Maaf, makanan/minuman '" + cariMakanan + "' tidak ada di menu.");
        }
    }
}