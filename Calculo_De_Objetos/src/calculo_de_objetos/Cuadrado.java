/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_de_objetos;

/**
 *
 * @author zues-
 */
public class Cuadrado {
  public double Z;
    public double operaciones;

    public  Cuadrado(double lado) {
        this.Z =  lado;
    }
    public  double CalArea(){
        operaciones = Z * Z;
        return operaciones;
    }

    public  double CalPerimetro(){
        operaciones = Z * 4;
        return operaciones;
   
    }
}
