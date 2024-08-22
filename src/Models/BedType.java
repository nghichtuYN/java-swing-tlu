package Models;

public class BedType {
    private  int id;
    private String bed_type_name;

    public BedType(int id, String bed_type_name) {
        this.id = id;
        this.bed_type_name = bed_type_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBed_type_name() {
        return bed_type_name;
    }

    public void setBed_type_name(String bed_type_name) {
        this.bed_type_name = bed_type_name;
    }
}
