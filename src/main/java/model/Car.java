package model;

public class Car {
    private String regId;
    private String color;

    public Car(String regId, String color) {
        this.regId = regId;
        this.color = color;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
