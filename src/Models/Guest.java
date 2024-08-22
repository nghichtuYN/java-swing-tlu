package Models;

import java.util.ArrayList;

public class Guest {
    private int id;
    private String fullName;
    private String email;
    private String phone_number;
    private ListBooking objListBooking;

    public Guest(int id, String fullName, String email, String phone_number) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone_number = phone_number;
    }
    private void init(){
        this.objListBooking=new ListBooking();
    }

    public Guest() {
        init();
    }

    public ListBooking getObjListBooking() {
        return objListBooking;
    }

    public void setObjListBooking(ListBooking objListBooking) {
        this.objListBooking = objListBooking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
