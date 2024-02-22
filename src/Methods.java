import java.util.ArrayList;
import java.util.List;

public class Methods {
    private List<CarInfo> carInfoList;

    public Methods() {

        this.carInfoList = new ArrayList<>();
    }

    public void addCar(CarInfo carInfo) {

        carInfoList.add(carInfo);
    }

    public void removeCar(int car) {

        carInfoList.remove(car);
    }

    public void displayAllCars() {
        System.out.println("All cars:");
        for (CarInfo carInfo : carInfoList)
        {
            carInfo.displayInfo();
        System.out.println("------------");
        }
    }

    public List<CarInfo> getAllCars() {

        return new ArrayList<>(carInfoList);
    }

    public int size() {

        return carInfoList.size();
    }

    public CarInfo getCar(int index) {

        return carInfoList.get(index);
    }
}
