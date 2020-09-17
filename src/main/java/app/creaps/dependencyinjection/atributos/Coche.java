package app.creaps.dependencyinjection.atributos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coche {

    @Value("VW")
    private String Marca;

    @Value("1981")
    private Integer modelo;

    @Autowired
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
