package Models;

import java.util.ArrayList;

public class ListRoom {
    private ArrayList<Room> listRoom;

    public ListRoom() {
        this.listRoom = new ArrayList<Room>();
    }

    public ArrayList<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(ArrayList<Room> listRoom) {
        this.listRoom = listRoom;
    }
}
