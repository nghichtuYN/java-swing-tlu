package Models;

public class Room {
    private int id;
    private int floor_id;
    private int room_class_id;
    private int status_id;
    private int room_number;

    public Room(int id, int floor_id, int room_class_id, int status_id, int room_number) {
        this.id = id;
        this.floor_id = floor_id;
        this.room_class_id = room_class_id;
        this.status_id = status_id;
        this.room_number = room_number;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor_id() {
        return floor_id;
    }

    public void setFloor_id(int floor_id) {
        this.floor_id = floor_id;
    }

    public int getRoom_class_id() {
        return room_class_id;
    }

    public void setRoom_class_id(int room_class_id) {
        this.room_class_id = room_class_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
}
