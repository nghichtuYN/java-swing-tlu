package Models;

public class RoomClassFeature {
    private int room_class_id;
    private int feature_id;

    public RoomClassFeature(int room_class_id, int feature_id) {
        this.room_class_id = room_class_id;
        this.feature_id = feature_id;
    }

    public int getRoom_class_id() {
        return room_class_id;
    }

    public void setRoom_class_id(int room_class_id) {
        this.room_class_id = room_class_id;
    }

    public int getFeature_id() {
        return feature_id;
    }

    public void setFeature_id(int feature_id) {
        this.feature_id = feature_id;
    }
}
