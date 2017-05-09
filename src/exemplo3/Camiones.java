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
public class Camiones extends Vehiculo{
    private boolean remolque;

    public Camiones(boolean remolque,String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.remolque=remolque;
    }
    

    @Override
    public String toString() {
        return "Camiones{" + "remolque=" + remolque + '}';
    }
    
    @Override
   public float calcularPrezo() {
       ICalculable ico = () -> remolque?super.getPotencia()*120+10000:super.getPotencia()*120;
       return ico.calcularPrezo();
   }
}
