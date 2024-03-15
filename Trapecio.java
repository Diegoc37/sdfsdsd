/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;


public class Trapecio {
    int basemenor; // Atributo que define la basemenor de un trapecio
    int basemayor; // Atributo que define la basemayor de un trapecio
    int altura; // Atributo que define la altura de un trapecio
    /**
     * Constructor de la clase r
     * @param base Parámetro que define la basemenor de un trapecio
     * @param base Parámetro que define la basemayor de un trapecio
     * @param altura Parámetro que define la altura de un trapecio
     */
    Trapecio(int basemenor, int basemayor, int altura) {
        this.basemenor = basemenor;
        this.basemayor = basemayor;
        this.altura = altura;
    }
    /**
     * Método que calcula y devuelve el área de un trapecio como el
     * promedio de las dos bases por la altura
     * @return Área de un trapecio
     */
    double calcularArea() {
        return ((basemenor+basemayor)/2)*altura;
    }
    /**
     * Método que calcula y devuelve el perímetro de un trapecio
     * basemenor + basemayor + las dos hipotenusas
     * @return Perímetro de un trapecio
     */
    double calcularPerimetro() {
        return basemenor+basemayor+(2*calcularHipotenusa());
    }
    double calcularHipotenusa() {
        return Math.pow(((basemayor-basemenor)*(basemayor-basemenor))+(altura*altura), 0.5);
    }
}
