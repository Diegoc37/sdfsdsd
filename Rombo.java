/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;
/**
* Esta clase define objetos de tipo rombo con una diagonal mayor y una menor .
* @version 1.2/2020
*/

public class Rombo {
    int diagonalmenor; // Atributo que define la diagonalmenor un rombo
    int diagonalmayor; // Atributo que define la diagonalmayor de un rombo
    /**
     * Constructor de la clase rombo
     * @param base Parámetro que define la diagonalmenor un rombo
     * @param altura Parámetro que define la diagonalmayor de un rombo
     */
    Rombo(int diagonalmenor, int diagonalmayor) {
        this.diagonalmenor = diagonalmenor;
        this.diagonalmayor = diagonalmayor;
    }
    /**
     * Método que calcula y devuelve el área de un rombo como la
     * multiplicación de la diagonalmenor de un rombo por la diagonalmayor de un rombo
     * @return Área de un rombo
     */
    double calcularArea() {
        return (diagonalmenor * diagonalmayor)/2;
    }
    /**
     * Método que calcula y devuelve el perímetro de un rombo
     * @return Perímetro de un rombo
     */
    
    double calcularPerimetro() {
        return (4 * calcularHipotenusa());
    }
    
    double calcularHipotenusa() {
        return Math.pow(((diagonalmenor*diagonalmenor)/4) + (diagonalmayor*diagonalmayor)/4, 0.5);
}
  
}

