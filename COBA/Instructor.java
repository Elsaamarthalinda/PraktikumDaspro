package COBA;

/**
 * Bagian 2: pengajar kursus.
 *
 * Jangan ubah nama kelas, nama method, atau signature-nya. Autograder
 * memanggilnya persis seperti yang tertulis di sini.
 *
 * Field tidak dideklarasikan di sini: baca diagram kelas di README.
 * Di Bagian 2 field boleh public. Di Bagian 3 kamu akan menutupnya.
 *
 * Kerangka field (lengkapi tipe dan nama dari diagram), letakkan di atas constructor:
 *   public ____ name;
 *   public ____ expertise;
 */
public class Instructor {
 
    public String name;
    public String expertise;
 
    /** Membuat pengajar dengan nama dan bidang keahlian. */
    public Instructor(String name, String expertise) {
        // TODO Bantuan: nama parameter sama dengan nama field. Kata kunci apa yang
        // menunjuk ke objek yang sedang dibuat?
        //
        // Kerangka:
        //   this.name = ____;
        //   this.expertise = ____;
        this.name = name;
        this.expertise = expertise;
    }
 
    public String getName() {
        // TODO Bantuan: kembalikan data yang disimpan constructor.
        //
        // Kerangka:
        //   return ____;
        return name;
    }
 
    public String getExpertise() {
        // TODO Bantuan: sama seperti getName.
        return expertise;
    }
 
    /** Teks berbentuk "nama (keahlian)". Contoh: Hendra Wijaya (Databases). */
    public String getInfo() {
        // TODO Bantuan: gabungkan dua data dengan operator + dan tanda kurung dalam String.
        //
        // Kerangka:
        //   return name + " (" + ____ + ")";
        return name + " (" + expertise + ")";
    }
}
 