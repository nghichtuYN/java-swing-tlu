package Models;

public class Features {
    private  int id;
    private String feature_name;

    public Features(int id, String feature_name) {
        this.id = id;
        this.feature_name = feature_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeature_name() {
        return feature_name;
    }

    public void setFeature_name(String feature_name) {
        this.feature_name = feature_name;
    }
}
