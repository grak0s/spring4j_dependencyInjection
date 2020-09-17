package app.creaps.dependencyinjection;
public class Coche {
    private String Marca;
    private Integer modelo;

    private Motor   motor;

    public Coche() {
    }

    public Coche(String marca, Integer modelo, Motor motor) {
        Marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Coche{" +
                "Marca='" + Marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }
}