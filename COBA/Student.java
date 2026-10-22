package COBA;
 
/**
 * Bagian 3: mahasiswa peserta kursus.
 *
 * Jangan ubah nama kelas, nama method, atau signature-nya. Autograder
 * memanggilnya persis seperti yang tertulis di sini.
 *
 * Field tidak dideklarasikan di sini: baca diagram kelas di README
 * (semua field harus private).
 *
 * Kerangka field (lengkapi dari diagram), letakkan di atas constructor:
 *   private ____ studentId;
 *   private ____ name;
 *   private int courseCount;   // nilai awal 0
 */
public class Student {
 
    private String studentId;
    private String name;
    private int courseCount = 0;
 
    /**
     * Membuat mahasiswa yang belum mengambil kursus.
     * studentId dan name tidak boleh null atau kosong: lempar
     * IllegalArgumentException jika tidak valid.
     */
    public Student(String studentId, String name) {
        // TODO Bantuan: validasi dulu sebelum mengisi field. Aturan nama sama dengan setName.
        // Bagian 4: kartu mahasiswa juga dibuat di sini (lihat diagram Bagian 4).
        //
        // Kerangka:
        //   if (studentId == null || ____) {
        //       throw new IllegalArgumentException("____");
        //   }
        //   this.studentId = studentId;
        //   setName(____);
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID mahasiswa tidak boleh kosong");
        }
        this.studentId = studentId;
        setName(name);
    }
 
    public String getStudentId() {
        // TODO Bantuan: kembalikan data yang disimpan constructor.
        return studentId;
    }
 
    public String getName() {
        // TODO Bantuan: sama seperti getStudentId.
        return name;
    }
 
    /** Nama tidak boleh null atau kosong: lempar IllegalArgumentException dan biarkan nama lama. */
    public void setName(String name) {
        // TODO Bantuan: periksa dulu, baru isi field.
        //
        // Kerangka:
        //   if (name == null || ____) {
        //       throw new IllegalArgumentException("____");
        //   }
        //   this.name = name;
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name;
    }
 
    public int getCourseCount() {
        // TODO Bantuan: kembalikan jumlah kursus yang sedang diambil.
        return courseCount;
    }
 
    /** True jika mahasiswa masih boleh mengambil kursus (batasnya 3 kursus). */
    public boolean canEnroll() {
        // TODO Bantuan: apakah perlu field baru, atau cukup dihitung dari data yang sudah ada?
        //
        // Kerangka:
        //   return courseCount ____ 3;
        return courseCount < 3;
    }
 
    /** Menambah jumlah kursus. Jika sudah di batas, tidak berubah dan hasilnya false. */
    public boolean addEnrollment() {
        // TODO Bantuan: periksa batas dulu. Adakah method lain di kelas ini yang sudah
        // menjawab pertanyaan "boleh atau tidak"?
        //
        // Kerangka:
        //   if (!____) {
        //       return false;
        //   }
        //   courseCount++;
        //   return true;
        if (!canEnroll()) {
            return false;
        }
        courseCount++;
        return true;
    }
 
    /** Mengurangi jumlah kursus. Jika sudah tidak ada kursus, tidak berubah dan hasilnya false. */
    public boolean removeEnrollment() {
        // TODO Bantuan: batas bawah jumlah kursus adalah berapa?
        //
        // Kerangka:
        //   if (courseCount == ____) {
        //       return false;
        //   }
        //   courseCount--;
        //   return true;
        if (courseCount == 0) {
            return false;
        }
        courseCount--;
        return true;
    }
}
 