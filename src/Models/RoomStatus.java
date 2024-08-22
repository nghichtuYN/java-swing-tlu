package Models;

public class RoomStatus {
    private int id;
    private String status_name;

    public RoomStatus() {
    }

    public RoomStatus(int id, String status_name) {
        this.id = id;
        this.status_name = status_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}
