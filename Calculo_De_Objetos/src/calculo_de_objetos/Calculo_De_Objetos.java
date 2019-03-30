/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_de_objetos;
import java.util.Scanner;
  
/**
 *
 * @author zues-
 */
public class Calculo_De_Objetos {
    static Cubo cubo;
    static double actual;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        Valor ();
        Calculo ();
        scanner.nextLine();
    }
    private static void Calculo(){
        int  op = Menu();
        while(op != 5)
        {
            actual = calcular(op ,cubo);
            System.out.println("El valor es " +actual+ "\n");
            op = Menu ();
        }
        
        Valor ();
        Calculo ();
    }
    private static void Valor(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado:\t");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException co ){
            System.out.println ("El valor debe de ser un entero");
            Valor ();
        }
    }
    public static double calcular( int opt, Cubo cubo){

        double result = 0;
        
        switch (opt){
            case 1: result =cubo.CalPerimetro(true); break;
            case 2: result = cubo.CalArea (); break;
            case 3: result = cubo.CalVolumen(); break;
            case 4: result = cubo.CalPerimetro(false); break;
            case 5: Valor();break;
            case 6: System.out.println ("Bye Bye");System.exit (0);break;
        }
        return result;
    }

    public static int Menu(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese el calculo a realizar: \n");
        System.out.print ("1) El Perímetro cuadrado: \n");
        System.out.print ("2) Para calcular el área: \n");
        System.out.print ("3) Para calcular el Volúmen: \n");
        System.out.print ("4) Para calcular el Perímetro del cubo: \n");
        System.out.print ("5) Reinicio:  \n");
        System.out.print ("6) Salir del programa: \n");

        int op  = Integer.parseInt( scanner.nextLine());
        return op;
    }
}

