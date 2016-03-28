/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args){
       Circulo [] ruedas =new Circulo[2];
       ruedas[0]=new Circulo (1,"a");
       ruedas[1]=new Circulo (1,"a");
       
       Triangulo[] marco = new Triangulo[3];
       marco[0]= new Triangulo (2,"b");
       marco[1]= new Triangulo (2,"b");
       marco[2]= new Triangulo (2,"b");       
       Circulo plato = new Circulo(1,"p");
       
       Bicicleta b =new Bicicleta (ruedas, plato, marco);
        System.out.println(b.area());
             
    }
}
