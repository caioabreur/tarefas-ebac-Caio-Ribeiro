import java.util.ArrayList;
import java.util.List;

class Garage<T extends Car> {
    private List<T> cars = new ArrayList<>();

    public void addCar(T car) {
        cars.add(car);
    }

    public List<T> getCars() {
        return cars;
    }

    public void showCars() {
        cars.forEach(car -> System.out.println(car.toString()));
    }
}
