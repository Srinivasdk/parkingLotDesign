package model;

public class Slot {
    private Car car;
    private boolean isAvailable;

    public Slot(Car car, boolean isAvailable) {
        this.car = car;
        this.isAvailable = isAvailable;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
