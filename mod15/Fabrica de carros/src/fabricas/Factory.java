package fabricas;

public abstract class Factory {

    public Car createCar(String requestGrade) {
        Car car = retrieveCar(requestGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.fuelCar();
        car.mechanicCheck();
        return car;
    }

    abstract Car retrieveCar(String requestGrade);
}
