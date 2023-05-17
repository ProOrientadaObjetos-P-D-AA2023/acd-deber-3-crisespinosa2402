/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paq1;

/**
 *
 * @author USUARIO
 */
public class Metodos {
    public double calcularDescuento(double precio, int nProductos) {
        double descuento = 0.0;
        if (precio >= 1000 && nProductos >= 10) {
            descuento = precio * 0.10;
        } else {
            if (precio < 1000) {
                double valorDescuento = 0.05;
                descuento = precio * valorDescuento;
            }
        }
        return descuento;
    }

    public double calcularPrecioFinal(double i, double j) {

        double total;
        
        total = i - j;
        
        return total;
    }
}
