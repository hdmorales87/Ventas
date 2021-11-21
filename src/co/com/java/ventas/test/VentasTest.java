/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.java.ventas.test;

import co.com.java.ventas.*;

/**
 *
 * @author Hector
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Chaqueta", 150.00);
        Producto producto3 = new Producto("Pantalon", 20.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        //producto1 = new Producto("Camisa", 50.00);
        //producto2 = new Producto("Chaqueta", 150.00);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
        
    }
}
