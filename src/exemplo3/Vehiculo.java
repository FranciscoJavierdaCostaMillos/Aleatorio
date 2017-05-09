/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo3;

/**
 *
 * @author fdacostamillos
 */
public abstract class Vehiculo implements ICalculable{
    private String matricula;
    private String marca;
    private int potencia;

    public Vehiculo(String matricula, String marca, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", potencia=" + potencia + '}';
    }
    @Override
    public float calcularPrezo(){
        return potencia+10;
    }
}
