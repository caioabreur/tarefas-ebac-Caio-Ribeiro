package fabricas;

public class CompanyCarFactory extends Factory{

    Car retrieveCar(String requestGrade) {
        return switch (requestGrade) {
            case "A" -> new Audi(2000, "Silver", "full");
            case "B" -> new Jeep(1500, "Green", "full");
            case "C" -> new Volvo(2500, "Black", "full");
            default -> {
                System.out.println("O carro requisitado infelizmente não está disnponível.");
                yield null;
            }
        };
    }
}
