package Models;

public class Floor {
    private int id;
    private int floor_number;
    private ListRoom objListRoom;

    public Floor(int id, int floor_number) {
        this.id = id;
        this.floor_number = floor_number;
    }

    public Floor() {
        this.objListRoom=new ListRoom();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(int floor_number) {
        this.floor_number = floor_number;
    }

    public ListRoom getObjListRoom() {
        return objListRoom;
    }

    public void setObjListRoom(ListRoom objListRoom) {
        this.objListRoom = objListRoom;
    }
}
