package COBA;
 
public class OfflineCourse extends Course {
 
    private String room;
 
    public OfflineCourse(String title, int year, String room) {
        super(title, year);
        this.room = room;
    }
 
    public String getRoom() {
        return room;
    }
}
 