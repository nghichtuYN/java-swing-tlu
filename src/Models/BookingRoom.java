package Models;

public class BookingRoom {
    private int booking_id;
    private int room_id;
    public BookingRoom(int booking_id, int room_id) {
        this.booking_id = booking_id;
        this.room_id = room_id;
    }
    public BookingRoom() {
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
