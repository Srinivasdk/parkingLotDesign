import model.Car;

public class ParkingLotService {
    ParkingLot parkingLot;
    public ParkingLotService() {
    }

    public void createParkingLot(String size) {
        if(parkingLot != null) {
            System.out.println(" exception thrown since parkinglot exists");
            return ;
        }
        parkingLot = new ParkingLot(Integer.parseInt(size));

    }

    public void parkVehicle(String regId, String colour) {
        Car car  = new Car(regId, colour);
        parkingLot.park(car);

    }

    public void leaveVehicle(String regId) {
        parkingLot.leave(regId);
    }

    public void print() {
        parkingLot.print();
    }

}
