package fabricas;

public abstract class Car {

    private Integer hourPower;
    private String color;
    private String fuelSource;

    public Car (Integer hourPower, String color, String fuelSource) {
        this.hourPower = hourPower;
        this.color = color;
        this.fuelSource = fuelSource;
    }

    public void startEngine() {
        System.out.println("O carro foi ligado e está pronto para andar!");
    }

    public void clean() {
        System.out.println("O carro foi limpo! cor " + color + " Restaurada.");
    }

    public void mechanicCheck() {
        System.out.println("O carro foi checado pelo mecânico! Tudo parece estar bom.");
    }

    public void fuelCar() {
        System.out.println("O tanque do carro foi completado e está em " + fuelSource);
    }
}
