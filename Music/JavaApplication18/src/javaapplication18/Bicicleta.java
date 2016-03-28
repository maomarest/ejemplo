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
public class Bicicleta {
    
    private Circulo[] ruedas;
    private Circulo plato;
    private Triangulo[] marco;
    
    public Bicicleta(Circulo[] ruedas, Circulo plato, Triangulo[] marco){
        this.ruedas=ruedas;
        this.marco=marco;
        this.plato=plato;
    }
    
    public double area(){
        double resultado = 0;
        resultado+=this.plato.area();
        for(Circulo c:this.ruedas)
            resultado += c.area();
        for(Triangulo t: this.marco)
            resultado += t.area();
        return resultado;
    }
    
}
