package COBA;
 
/**
 * Bagian 4: ruang kelas (agregasi dengan OnlineCourse).
 * Menyimpan maksimal 5 kursus; kursusnya tetap hidup di luar Classroom.
 */
public class Classroom {
 
    private String code;
    private OnlineCourse[] courses = new OnlineCourse[5];
    private int count = 0;
 
    public Classroom(String code) {
        this.code = code;
    }
 
    public String getCode() {
        return code;
    }
 
    public int getCourseCount() {
        return count;
    }
 
    /** Menambah kursus. False jika kursus null atau kelas sudah penuh (5 kursus). */
    public boolean addCourse(OnlineCourse course) {
        if (course == null || count >= courses.length) {
            return false;
        }
        courses[count] = course;
        count++;
        return true;
    }
 
    /** Mencari kursus berdasarkan kode; mengembalikan objek yang sama, atau null. */
    public OnlineCourse findByCode(String code) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getCode().equals(code)) {
                return courses[i];
            }
        }
        return null;
    }
 
    /** Jumlah kursus di kelas ini yang saat ini tersedia. */
    public int countAvailable() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            if (courses[i].isAvailable()) {
                total++;
            }
        }
        return total;
    }
}
 