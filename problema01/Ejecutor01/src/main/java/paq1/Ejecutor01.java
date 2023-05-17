/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paq1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutor01 {

    public static void main(String[] args) {
        System.out.println("Informacion del producto y su descuento");
        
         Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);

        System.out.println("Ingrese el precio del producto");
        double producto = entrada.nextDouble();

        System.out.println("ingrese el total de producto");
        int nProductos = entrada.nextInt();

        Metodos m = new Metodos();

        double descuento = m.calcularDescuento(producto, nProductos);
        double precioFinal = m.calcularPrecioFinal(producto, descuento);

        System.out.println("Descuento de: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
    }
}
