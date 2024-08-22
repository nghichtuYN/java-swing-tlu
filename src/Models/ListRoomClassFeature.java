package Models;

import java.util.ArrayList;

public class ListRoomClassFeature {
    private ArrayList<RoomClassFeature> listRoomClassFeature;

    public ListRoomClassFeature() {
        this.listRoomClassFeature = new ArrayList<RoomClassFeature>();
    }

    public ArrayList<RoomClassFeature> getListRoomClassFeature() {
        return listRoomClassFeature;
    }

    public void setListRoomClassFeature(ArrayList<RoomClassFeature> listRoomClassFeature) {
        this.listRoomClassFeature = listRoomClassFeature;
    }
}
