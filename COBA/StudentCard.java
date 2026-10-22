package COBA;
 
/**
 * Bagian 4: kartu mahasiswa (komposisi dengan Student).
 * Objek ini dibuat di dalam constructor Student, nomornya "SC-" + studentId.
 */
public class StudentCard {
 
    private String number;
 
    public StudentCard(String number) {
        this.number = number;
    }
 
    public String getNumber() {
        return number;
    }
}
 