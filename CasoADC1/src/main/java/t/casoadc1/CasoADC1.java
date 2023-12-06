/*
Elaborar un algoritmo que permita leer los datos de un automóvil 
(marca, origen y costo) imprima el impuesto por pagar y el precio de venta 
(incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de 
Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%.
 */

package t.casoadc1;
import java.util.Scanner;


public class CasoADC1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //variables 
        /*las variables presentadas dependen de los datos que se pueden ingresa
        y de los datos a los que quiero llegar y son estos los que necesito para
        la resolucion de mi caso
        */
        
        String marca;
        String origen;
        double costo;
        double iva = 0;
        double precio = 0;
        String reset = "si";
        String respuesta;
        
        
     
     
        
        
        // Entrada
        /*
        aqui es donde debo ingresar los datos que estableci anteriormente
        y para un mejor entendimiento se ingresa peticiones para saber cual
        es la variable a la que estoy dando un valor.
        tambien se utilizo un while para permitirme repetir el proceso si es
        que lo deseo una vez finalice con el proceso que ya esta en curso.
        */
        
        while ("si".equals(reset)){
            System.out.println("Este es el sistema de calculo de precio de venta de vehiculos");
            System.out.println("cual es la marca de origen");
            marca = leer.nextLine();
            System.out.println("Del siguiente listado eliga el pais de Origen de su vehiculo");
            System.out.println("Alemania");
            System.out.println("Japon");
            System.out.println("Italia");
            System.out.println("USA");
            System.out.println("Porfavor digite pais de origen en minuscula");
            origen = leer.nextLine();
            System.out.println("Ingrese el costo del vehiculo");
            costo = leer.nextDouble();
            
            //Procesamiento
            /*
            basandose en las respuestas de la seccion de entrada la etapa de 
            procesamiento entra en escena con un switch que me permite elegir 
            el proceso correcto dependiendo del pais y el coste del vehiculo 
            se utilizo un switch ya que tenemos varias opciones de respuesta el 
            la seccion de entrada
            */
        
            switch (origen){
                case "alemania" -> {
                    iva=costo*0.20;
                    precio=costo+iva;
                }
                
                
                case "japon" -> {
                    iva=costo*0.30;
                    precio=costo+iva;
                }
                
            
                case "italia" -> {
                    iva=costo*0.15;
                    precio=costo+iva;
            }
            
                
                case "usa" -> {
                    iva=costo*0.08;
                    precio=costo+iva;
                }
                
                
                
                default -> 
                        System.out.println("Los valores no coinciden");
                
            
                
            }
            
            //salida
            /* la seccion de entrada es literalmente el resultado del 
            procedimiento, basandome unicamente en los datos que me establecia 
            la problematica, desidi montar los resultados identificados en 
            distintas lineas porque a mi parecer queda mas estetico
            */
            
            System.out.println("Resumen de venta del Vehiculo");
            System.out.println("Marca="+marca);
            System.out.println("Origen="+origen);
            System.out.println("Costo="+costo);
            System.out.println("iva="+iva);
            System.out.println("Total="+precio);
            
            
            
            
            // reset o final
            /*
            mi interes en esta seccion se basa en que queria que se muestre un
            texto si es que el usuario no quiere continuar con el procedimiento
            y que sea evidente que el servicio a finalizado.
         
            */
            
            leer.nextLine();
            System.out.print("Desea Repetir con el calculo desde el inicio?");
            System.out.println(); // Esta línea está en blanco
            System.out.print("Ingrese si par continuar o cualquier otro dato para finalizar");
            System.out.println(); // Esta línea está en blanco

         
            respuesta = leer.nextLine();
            
            
            /*utilizar if me resulto un poco complicado porque encontre muchos  ejemplos
            de como lo podria utilizar y no sabia cual me serviria asi que experimente 
            con varios y este es el resultado
            */
            if (respuesta.equalsIgnoreCase("si")) {
                reset = respuesta;
            
        } else {
            System.out.println("Gracias por utilizar nustro sistema.");
            break;
                    
        }
           
        }
        
    }
        
}
