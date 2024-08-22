package Models;

import java.util.ArrayList;

public class ListBookingAddon {
    private ArrayList<BookingAddon> listBookingAddon;

    public ListBookingAddon() {
        this.listBookingAddon= new ArrayList<BookingAddon>();
    }

    public ArrayList<BookingAddon> getListBookingAddon() {
        return listBookingAddon;
    }

    public void setListBookingAddon(ArrayList<BookingAddon> listBookingAddon) {
        this.listBookingAddon = listBookingAddon;
    }
}
