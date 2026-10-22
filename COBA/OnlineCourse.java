package COBA;
 
/**
 * Bagian 2 dan 3: kursus online.
 *
 * Jangan ubah nama kelas, nama method, atau signature-nya. Autograder
 * memanggilnya persis seperti yang tertulis di sini.
 *
 * Field tidak dideklarasikan di sini: baca diagram kelas di README.
 * Method untuk bagian berikutnya (setInstructor, getInstructor, dan seterusnya) kamu
 * tambahkan sendiri sesuai diagram di bagian tersebut.
 *
 * Kerangka field (lengkapi tipe dan nama dari diagram), letakkan di atas constructor:
 *   public String code;
 *   public ____ title;
 *   public ____ year;
 *   public ____ available;
 */
public class OnlineCourse extends Course {
 
    private String code;
    private Instructor instructor;
 
    /**
     * Membuat kursus baru yang kursinya masih kosong (tersedia).
     * Bagian 3: code tidak boleh kosong; title dan year divalidasi seperti setter-nya.
     */
    public OnlineCourse(String code, String title, int year) {
        // TODO Bantuan: isi semua field. Kursus baru: apakah kursinya sudah terisi atau belum?
        // Bagian 3: aturan validasi judul dan tahun sama dengan setter. Bisakah constructor
        // memakai setter-nya?
        //
        // Kerangka (Bagian 2):
        //   this.code = code;
        //   this.title = ____;
        //   this.year = ____;
        //   this.available = ____;
        //
        // Kerangka (Bagian 3): ganti dua baris title dan year dengan pemanggilan setter.
        //   setTitle(____);
        //   setYear(____);
        super(title, year);
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode kursus tidak boleh kosong");
        }
        this.code = code;
    }
 
    public String getCode() {
        // TODO Bantuan: kembalikan data yang disimpan constructor.
        //
        // Kerangka:
        //   return ____;
        return code;
    }
 
    /** Bagian 4 (asosiasi). Pengajar kursus; null jika belum ada. */
    public Instructor getInstructor() {
        return instructor;
    }
 
    /** Bagian 4 (asosiasi). Mengatur pengajar; null melepas pengajar. */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
 