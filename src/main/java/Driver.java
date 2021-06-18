import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ParkingLotService parkingLotService = new ParkingLotService();
        while(true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            String commandType = inputArray[0];
            switch(commandType) {
                case "create_parking_lot":
                    parkingLotService.createParkingLot(inputArray[1]);
                    break;
                case "park" :
                    //System.out.println(inputArray[1] + "  "+ inputArray[2]);
                    parkingLotService.parkVehicle(inputArray[1], inputArray[2]);
                    break;
                case "leave" :
                    parkingLotService.leaveVehicle(inputArray[1]);
                    break;
                case "status" :
                    parkingLotService.print();
                    break;
            }

        }
    }
}
