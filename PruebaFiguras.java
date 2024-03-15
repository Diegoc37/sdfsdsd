/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras;
/**
* Esta clase prueba diferentes acciones realizadas en diversas figuras
 * geométricas.
* @version 1.2/2020
*/
public class PruebaFiguras {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo(6,8);
        Trapecio figura6 = new Trapecio(2,3,2);        
        System.out.println("El area del círculo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triangulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El area del rombo es = " + figura5.calcularArea());
        System.out.println("El perimetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();
        System.out.println("El area del trapecio es = " + figura6.calcularArea());
        System.out.println("El perimetro del trapecio es = " + figura6.calcularPerimetro());
        System.out.println();
    }
}
    
    

