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
public class Coches extends Vehiculo{
    private int nportas;

    public Coches(int nportas, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.nportas = nportas;
    }

    @Override
    public String toString() {
        return super.toString()+nportas + "numero de portas"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public float calcularPrezo() {
       ICalculable ico = () -> {return 95*super.getPotencia();};           
       return ico.calcularPrezo();
   }
    
    
    
   
}
