/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;


public class Trapecio {
    int basemenor; // Atributo que define la base de un rectángulo
    int basemayor; // Atributo que define la altura de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    Trapecio(int basemenor, int basemayor, int altura) {
        this.basemenor = basemenor;
        this.basemayor = basemayor;
        this.altura = altura;
    }
    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * @return Área de un rectángulo
     */
    double calcularArea() {
        return ((basemenor+basemayor)/2)*altura;
    }
    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * @return Perímetro de un rectángulo
     */
    double calcularPerimetro() {
        return basemenor+basemayor+(2*calcularHipotenusa());
    }
    double calcularHipotenusa() {
        return Math.pow(((basemayor-basemenor)*(basemayor-basemenor))+(altura*altura), 0.5);
    }
}
