package src;

public class Pessoa {
    String name;
    String sexo;

    public Pessoa(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
