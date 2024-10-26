package fabricas;

public class CarFactory extends Factory{

    Car retrieveCar(String requestGrade) {
        return switch (requestGrade) {
            case "A" -> new Volkswagen(200, "Black", "full");
            case "B" -> new Toyota(150, "Blue", "full");
            case "C" -> new Chevrolet(250, "Silver", "full");
            default -> {
                System.out.println("O carro requisitado infelizmente não está disnponível.");
                yield null;
            }
        };
    }
}
