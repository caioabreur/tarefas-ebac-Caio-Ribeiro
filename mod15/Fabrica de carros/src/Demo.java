import fabricas.*;

public class Demo {
    public static void main(String[] args) {

        Customer cliente = new Customer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.createCar(cliente.getGradeRequest());
        car.startEngine();

    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.HasCompanyContract()) {
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}