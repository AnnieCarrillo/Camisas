/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camisasejercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author Annie
 */
public class CamisasEjercicio {
/*
     Desarrollar el programa en java que calcule los 
    costos en caja de una tienda de camisas, cuyos descuentos 
    y total se calculan en base a las siguientes tablas
    
    Camisas <= 2 → Descuento 0% 
    3 <= Camisas <= 5 → Descuento 5%
    Camisas >= 5 → Descuento 8%
    
    1.Camisa de manga corta $190
    2.Camisa casual de manga larga $230
    3.Camisa formal de manga larga $310
     
    Implementar los casos de prueba unitaria automatizadas sobre los 
    metodos que realizan los calculos con la biblioteca JUnit.
     */
    
    public static void main(String[] args) {
     String lista = (String) JOptionPane.showInputDialog(null, "Seleccione la opcion de camisa a comprar", "Camisas", 
              JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "1.Camisa de manga corta", "2.Camisa casual de manga larga", 
                    "3.Camisa formal de manga larga"}, "Selecciona");
     
      double Precio = 0;
        switch (lista) {
            case "1.Camisa de manga corta":
                Precio = 190.00;
                break;
            case "2.Camisa casual de manga larga":
                Precio = 230.00;
                break;
            case "3.Camisa formal de manga larga":
                Precio = 310;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opción válida");
                System.exit(0);
                break;
        }
        
      //double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
      int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
      double total_pago = cantidad*Precio;
      
        if (cantidad >= 3 && cantidad <= 5){
         double descuento = total_pago*0.05;
         total_pago = total_pago-descuento;
     }
     else if(cantidad >= 5){
         double descuento = total_pago*0.08;
         total_pago = total_pago-descuento;
     }
     else{
         // Si la cantidad es menor que 3, no se aplica ningún descuento.
     }  
       JOptionPane.showMessageDialog(null, "El total a pagar es: " + total_pago);
    }
    
}

