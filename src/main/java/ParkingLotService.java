import model.Car;

public class ParkingLotService {
    ParkingLot parkingLot;
    public ParkingLotService() {
    }

    public void createParkingLot(String size) {
        System.out.println(" iam in creating mode");
        if(parkingLot != null) {
            System.out.println(" exception thrown since parkinglot exists");
            return ;
        }
        System.out.println("creating parking lot");
        parkingLot = new ParkingLot(Integer.parseInt(size));

    }

    public void parkVehicle(String regId, String colour) {
        Car car  = new Car(regId, colour);
        System.out.println(" iam  sdfdsd");
        parkingLot.park(car);

    }

    public void leaveVehicle(String regId) {
        System.out.println("iam in removal3");
        parkingLot.leave(regId);
    }

    public void print() {
        parkingLot.print();
    }

}
