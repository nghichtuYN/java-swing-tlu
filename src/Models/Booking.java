package Models;

import java.util.Date;

public class Booking {
    private int id;
    private int guest_id;
    private int payment_status_id;
    private Date checkin_date;
    private Date checkout_date;
    private int num_adults;
    private int num_children;
    private int booking_amount;
    private ListBookingRoom objListBookingRoom;
    private ListBookingAddon objListBookingAddon;
    public Booking(int id, int guest_id, int payment_status_id, Date checkin_date, Date checkout_date, int num_adults, int num_children, int booking_amount) {
        this.id = id;
        this.guest_id = guest_id;
        this.payment_status_id = payment_status_id;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
        this.num_adults = num_adults;
        this.num_children = num_children;
        this.booking_amount = booking_amount;
    }
    public Booking() {
        this.objListBookingRoom = new ListBookingRoom();
        this.objListBookingAddon = new ListBookingAddon();
    }

    public ListBookingRoom getObjListBookingRoom() {
        return objListBookingRoom;
    }

    public void setObjListBookingRoom(ListBookingRoom objListBookingRoom) {
        this.objListBookingRoom = objListBookingRoom;
    }

    public ListBookingAddon getObjListBookingAddon() {
        return objListBookingAddon;
    }

    public void setObjListBookingAddon(ListBookingAddon objListBookingAddon) {
        this.objListBookingAddon = objListBookingAddon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPayment_status_id() {
        return payment_status_id;
    }

    public void setPayment_status_id(int payment_status_id) {
        this.payment_status_id = payment_status_id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public Date getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(Date checkin_date) {
        this.checkin_date = checkin_date;
    }

    public Date getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(Date checkout_date) {
        this.checkout_date = checkout_date;
    }

    public int getNum_children() {
        return num_children;
    }

    public void setNum_children(int num_children) {
        this.num_children = num_children;
    }

    public int getNum_adults() {
        return num_adults;
    }

    public void setNum_adults(int num_adults) {
        this.num_adults = num_adults;
    }

    public int getBooking_amount() {
        return booking_amount;
    }

    public void setBooking_amount(int booking_amount) {
        this.booking_amount = booking_amount;
    }
}
