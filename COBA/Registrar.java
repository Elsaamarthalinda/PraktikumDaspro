package COBA;
 
/**
 * Bagian 4: petugas pendaftaran (dependensi pada Student dan OnlineCourse).
 * Tidak punya field; objek hanya datang lewat parameter.
 */
public class Registrar {
 
    /**
     * Mendaftarkan mahasiswa ke kursus. Berhasil hanya jika mahasiswa boleh
     * mengambil kursus dan kursus tersedia. Jika gagal, tidak ada yang berubah.
     */
    public boolean enroll(Student student, OnlineCourse course) {
        if (student == null || course == null) {
            return false;
        }
        if (!student.canEnroll() || !course.isAvailable()) {
            return false;
        }
        course.takeSeat();
        student.addEnrollment();
        return true;
    }
 
    /**
     * Membatalkan pendaftaran. Berhasil hanya jika kursi kursus sedang terisi
     * dan mahasiswa punya kursus.
     */
    public boolean drop(Student student, OnlineCourse course) {
        if (student == null || course == null) {
            return false;
        }
        if (course.isAvailable() || student.getCourseCount() == 0) {
            return false;
        }
        course.releaseSeat();
        student.removeEnrollment();
        return true;
    }
}
 