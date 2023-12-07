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


public class gastos {
    
    private double ingresos;
    private double gastoscomida;
    private double gastostransporte;
    private double gastosentretenimiento;
    private double limingresos;
    private double limgastoscomida;
    private double limgastostransporte;
    private double limgastosentretenimiento;
    private double gastototal;
    private double saldo;
    
    
    //constructor
     
    public gastos() {
        
        this.ingresos = ingresos;
        this.gastoscomida = gastoscomida;
        this.gastostransporte = gastostransporte;
        this.gastosentretenimiento = gastosentretenimiento;
        this.limingresos = limingresos;
        this.limgastoscomida = limgastoscomida;
        this.limgastostransporte = limgastostransporte;
        this.limgastosentretenimiento = limgastosentretenimiento;
        this.gastototal = gastototal;
        this.saldo = saldo;
        
    
    }
    
    public double getingresos(){
        return ingresos;
    }
    public void setingresos (double ingresos){
        this.ingresos = ingresos ;
    }
    
    public double getlimingresos(){
        return limingresos;
    }
    public void setlimingresos (double limingresos){
        this.limingresos = 0 ;
    }

    
    public double getgastoscomida(){
        return gastoscomida;
        
    }
    public void setgastoscomida (double gastoscomida){
        this.gastoscomida = gastoscomida ;
    }
    
    public double getlimgastoscomida(){
        return ingresos * 0.5;
        
    }
    

    public double getgastostransporte(){
        return gastostransporte;
    }
    public void setgastostransporte (double gastostransporte){
        this.gastostransporte = gastostransporte ;
   }
    public double getlimgastostransporte(){
        return ingresos * 0.25;
    }
    
    
    public double getgastosentretenimiento(){
        return gastosentretenimiento;
    }
    public void setgastosentretenimiento (double gastosentretenimiento){
        this.gastosentretenimiento = gastosentretenimiento ;
    }
    public double getlimgastosentretenimiento(){
        return ingresos * 0.25 ;
    }
    public double gastototal (){
        return -gastoscomida - gastostransporte - gastosentretenimiento;
    }
  
    public double saldorestante (){
        return ingresos - gastoscomida - gastostransporte - gastosentretenimiento; 
    }
    
            
    public void generarReporte() {
        System.out.println("=== Reporte de Gastos ===");
        System.out.println("Ingresos: $" + getingresos());
        System.out.println("Gastos en Comida: $" + getgastoscomida());
        System.out.println("Gastos en Transporte: $" + getgastostransporte());
        System.out.println("Gastos en Entretenimiento: $" + getgastosentretenimiento());
        System.out.println("Gastos Totales: $" + gastototal());
        System.out.println("Saldo Disponible: $" + saldorestante());
        
    }
    
}
