package Models;

import java.util.ArrayList;

public class ListBooking {
    private ArrayList<Booking> listBooking;

    public ListBooking() {
        this.listBooking = new ArrayList<Booking>();
    }

    public ArrayList<Booking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(ArrayList<Booking> listBooking) {
        this.listBooking = listBooking;
    }
}
