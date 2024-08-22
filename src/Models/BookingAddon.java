package Models;

public class BookingAddon {
    private int booking_id;
    private int addon_id;

    public BookingAddon(int booking_id, int addon_id) {
        this.booking_id = booking_id;
        this.addon_id = addon_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getAddon_id() {
        return addon_id;
    }

    public void setAddon_id(int addon_id) {
        this.addon_id = addon_id;
    }
}
