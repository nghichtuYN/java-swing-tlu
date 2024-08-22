package Models;

public class RoomClass {
    private  int id;
    private  String class_name;
    private  double base_price;
    private ListRoom objListRoom;
    private ListRoomClassBedType objListRoomClassBedType;
    private ListRoomClassFeature objListRoomClassFeature;
    public int getId() {
        return id;
    }

    public RoomClass() {
        this.objListRoom=new ListRoom();
        this.objListRoomClassBedType=new ListRoomClassBedType();
        this.objListRoomClassFeature= new ListRoomClassFeature();
    }

    public ListRoomClassBedType getObjListRoomClassBedType() {
        return objListRoomClassBedType;
    }

    public ListRoomClassFeature getObjListRoomClassFeature() {
        return objListRoomClassFeature;
    }

    public void setObjListRoomClassFeature(ListRoomClassFeature objListRoomClassFeature) {
        this.objListRoomClassFeature = objListRoomClassFeature;
    }

    public void setObjListRoomClassBedType(ListRoomClassBedType objListRoomClassBedType) {
        this.objListRoomClassBedType = objListRoomClassBedType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public ListRoom getObjListRoom() {
        return objListRoom;
    }

    public void setObjListRoom(ListRoom objListRoom) {
        this.objListRoom = objListRoom;
    }
}
