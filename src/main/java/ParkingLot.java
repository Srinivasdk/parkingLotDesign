import model.Car;
import model.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    int parkingLotSize;
    List<Slot> slots;
    Map<String, List<Slot>> colourMap = new HashMap<>();

    public ParkingLot(int parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
        this.slots = new ArrayList<>();
    }

    public int getParkingLotSize() {
        return parkingLotSize;
    }

    public void setParkingLotSize(int parkingLotSize) {
        this.parkingLotSize = parkingLotSize;
    }

    public void park(Car car) {
        System.out.println("iam herezdvdfds");
        System.out.println("parking lot size "+ parkingLotSize);
        if(slots.size() < parkingLotSize) {
            Slot slot = new Slot(car, false);
            String carColor = car.getColor();
            System.out.println(" car color "+ carColor);
            System.out.println(" car color 123 "+ carColor);
            slots.add(slot);
            System.out.println(" iam thisere dfsdgs ertet " + slots.get(0).getCar().getRegId());
            if(!colourMap.containsKey(carColor)) {
                System.out.println(" iam in map1");
                List<Slot> slotList = new ArrayList<>();
                slotList.add(slot);
                colourMap.put(carColor, slotList);
                System.out.println(" iam in map");
            }
            else {
                System.out.println(" iam in map else");
                colourMap.get(carColor).add(slot);
            }
        } else {
            System.out.println("parking lot is full");
            return;
        }
    }


    public void leave(String regId) {
        System.out.println("iam in removal1");
        System.out.println("size of slots removing1 " + slots.size());
        for(Slot slot: slots) {
            if(slot.getCar().getRegId().equalsIgnoreCase(regId)) {
                System.out.println("iam in removal");
                slots.remove(slot);
                colourMap.get(slot.getCar().getColor()).remove(slot);
            }
        }
        System.out.println("size of slots removing " + slots.size());
    }

    public void print() {
        for(Map.Entry<String, List<Slot>> m : colourMap.entrySet()) {
            System.out.println("color " + m.getKey() + " wrerewr");
            for(Slot slot : m.getValue()) {
                System.out.print(slot.getCar().getRegId() + " ");
            }
//            m.getValue().stream().forEach(a  -> System.out.print(a.getCar().getRegId()));
            System.out.println();
        }
    }

}
