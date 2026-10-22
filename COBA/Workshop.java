package COBA;
 
public class Workshop extends Course {
 
    private int seats;
 
    public Workshop(String title, int year, int seats) {
        super(title, year);
        this.seats = seats;
    }
 
    public int getSeats() {
        return seats;
    }
}
 