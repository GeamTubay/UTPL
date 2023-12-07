/*
La clase Gastos podría contener métodos para registrar los gastos de una persona, 
como los gastos en comida, transporte, entretenimiento, etc. Además, la clase 
podría contener un atributo para mantener un registro de los ingresos de la persona.
La clase también podría tener métodos para calcular el total de los gastos, el 
saldo disponible y para generar reportes de gastos. Además, se podrían incluir 
métodos para establecer un presupuesto para cada categoría de gastos y para 
enviar alertas cuando se supera el presupuesto.
En resumen, la clase Gastos permitiría a una persona registrar y monitorear sus 
gastos y establecer un control financiero personalizado.
*/

package tg.gastos.personales;

import java.util.Scanner;


public class GastosPersonales {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    gastos misgastos = new gastos ();
    String respuesta;
    
    System.out.println("Bienvenido al sistema de gestion de gastos personales");
    
    
        do {
            System.out.println("Ingrese el monto de ingresos:");
            misgastos.setingresos(scanner.nextDouble());
            while (misgastos.getingresos()<= misgastos.getlimingresos()){
               System.out.println("No tiene fondos, ingrese datos validos"); 
            }
   
    
  
            System.out.println("Ingrese el monto de gastos en comida:");
            System.out.println("Sus gastos no deben superar el 50% de sus ingresos:");
            misgastos.setgastoscomida(scanner.nextDouble());
            while (misgastos.getgastoscomida()>misgastos.getlimgastoscomida()){
                System.out.println("Sus gastos exceden 50% de sus ingresos:");
                System.out.println("Ingrese el monto de gastos en comida:");
                misgastos.setgastoscomida(scanner.nextDouble());
            } 
   

            System.out.println("Ingrese el monto de gastos en transporte:");
            System.out.println("Sus gastos exceden el 25% de sus ingresos:");
            misgastos.setgastostransporte(scanner.nextDouble());
            while (misgastos.getgastostransporte()>misgastos.getlimgastostransporte()){
                System.out.println("Sus gastos exceden el 25% de sus ingresos:");
                System.out.println("Ingrese el monto de gastos en transporte:");
                misgastos.setgastostransporte(scanner.nextDouble());
            }
 
            System.out.println("Ingrese el monto de gastos en entretenimiento:");
            System.out.println("Sus gastos no deben superar el 50% de sus ingresos:");
            misgastos.setgastosentretenimiento(scanner.nextDouble());
            while (misgastos.getgastosentretenimiento()>misgastos.getlimgastosentretenimiento()){
                System.out.println("Sus gastos no deben superar el 50% de sus ingresos:");
                System.out.println("Ingrese el monto de gastos en entretenimiento:");
                misgastos.setgastosentretenimiento(scanner.nextDouble());
            }

            misgastos.generarReporte();
        
        
        
            System.out.println("¿Quieres realizar un nuevo calculo? (s/n): ");
            respuesta = scanner.next().toLowerCase();
        
    
            switch (respuesta) {
                case "s" -> System.out.println("Retornando Calculo");
                case "n" -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Respuesta no válida, se retomara el calculo desde el inicio.");
                       
                           
                
              
                
            } 
        
        }while(!respuesta.equals("n"));
        
        scanner.close();
   
    }
}
