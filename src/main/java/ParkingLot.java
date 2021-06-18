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
        if(slots.size() < parkingLotSize) {
            Slot slot = new Slot(car, false);
            String carColor = car.getColor();
            slots.add(slot);
            if(!colourMap.containsKey(carColor)) {
                List<Slot> slotList = new ArrayList<>();
                slotList.add(slot);
                colourMap.put(carColor, slotList);
            }
            else {
                colourMap.get(carColor).add(slot);
            }
        } else {
            return;
        }
    }


    public void leave(String regId) {
        for(Slot slot: slots) {
            if(slot.getCar().getRegId().equalsIgnoreCase(regId)) {
                slots.remove(slot);
                colourMap.get(slot.getCar().getColor()).remove(slot);
            }
        }
    }

    public void print() {
        for(Map.Entry<String, List<Slot>> m : colourMap.entrySet()) {
            for(Slot slot : m.getValue()) {
                System.out.print(slot.getCar().getRegId() + " ");
            }
//            m.getValue().stream().forEach(a  -> System.out.print(a.getCar().getRegId()));
            System.out.println();
        }
    }

}
