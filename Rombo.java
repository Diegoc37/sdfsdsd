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
    int diagonalmenor; // Atributo que define la base de un rectángulo
    int diagonalmayor; // Atributo que define la altura de un rectángulo
    /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    Rombo(int diagonalmenor, int diagonalmayor) {
        this.diagonalmenor = diagonalmenor;
        this.diagonalmayor = diagonalmayor;
    }
    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * @return Área de un rectángulo
     */
    double calcularArea() {
        return (diagonalmenor * diagonalmayor)/2;
    }
    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * @return Perímetro de un rectángulo
     */
    
    double calcularPerimetro() {
        return (4 * calcularHipotenusa());
    }
    
    double calcularHipotenusa() {
        return Math.pow(((diagonalmenor*diagonalmenor)/4) + (diagonalmayor*diagonalmayor)/4, 0.5);
}
  
}

