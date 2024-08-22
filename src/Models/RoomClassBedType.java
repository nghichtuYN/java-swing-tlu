package Models;

public class RoomClassBedType {
    private  int room_class_id;
    private int bed_type_id;
    private  int num_beds;

    public RoomClassBedType(int room_class_id, int bed_type_id, int num_beds) {
        this.room_class_id = room_class_id;
        this.bed_type_id = bed_type_id;
        this.num_beds = num_beds;
    }

    public RoomClassBedType() {
    }

    public int getRoom_class_id() {
        return room_class_id;
    }

    public void setRoom_class_id(int room_class_id) {
        this.room_class_id = room_class_id;
    }

    public int getBed_type_id() {
        return bed_type_id;
    }

    public void setBed_type_id(int bed_type_id) {
        this.bed_type_id = bed_type_id;
    }

    public int getNum_beds() {
        return num_beds;
    }

    public void setNum_beds(int num_beds) {
        this.num_beds = num_beds;
    }
}
