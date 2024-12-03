public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Corolla");
        SUV suv = new SUV("Ford", "Explorer");
        Truck truck = new Truck("Volvo", "FH16");

        Garage<Car> garage = new Garage<>();
        garage.addCar(sedan);
        garage.addCar(suv);
        garage.addCar(truck);

        System.out.println("Cars in the garage:");
        garage.showCars();
    }
}
