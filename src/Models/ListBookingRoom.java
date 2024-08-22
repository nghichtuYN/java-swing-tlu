package Models;

import java.util.ArrayList;

public class ListBookingRoom {
    private ArrayList<BookingRoom> listBookRoom;

    public ListBookingRoom() {
        this.listBookRoom = new ArrayList<BookingRoom>();
    }

    public ArrayList<BookingRoom> getListBookRoom() {
        return listBookRoom;
    }

    public void setListBookRoom(ArrayList<BookingRoom> listBookRoom) {
        this.listBookRoom = listBookRoom;
    }
}
