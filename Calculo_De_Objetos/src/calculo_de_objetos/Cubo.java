/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_de_objetos;
import java.lang.Math;
/**
 *
 * @author zues-
 */
public class Cubo extends Cuadrado{
    public double Z;
    public double operacion;

    public Cubo(double lado) {
        super(lado);

        this.Z = lado;
    }
    public  double CalVolumen(){
        return Math.pow(this.Z,3);
    }
    public   double CalPerimetro(boolean is_super)
    {
        if (is_super){
           return super.CalPerimetro ();
        }
        else{
            return this.Z*12;
        }


    }
    
}

