package COBA;
 
public class Course {
 
    protected String title;
    protected int year;
    private boolean available;
 
    public Course(String title, int year) {
        setTitle(title);
        setYear(year);
        this.available = true;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul tidak boleh kosong");
        }
        this.title = title;
    }
 
    public int getYear() {
        return year;
    }
 
    public void setYear(int year) {
        if (year < 2015) {
            throw new IllegalArgumentException("Tahun minimal 2015");
        }
        this.year = year;
    }
 
    public boolean isAvailable() {
        return available;
    }
 
    public boolean takeSeat() {
        if (!available) {
            return false;
        }
        available = false;
        return true;
    }
 
    public void releaseSeat() {
        available = true;
    }
}
 