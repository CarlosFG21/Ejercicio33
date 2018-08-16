/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33video39;

/**
 *
 * @author DELL
 */
public class Ejercicio33Video39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      empleado3[] misempleados = new empleado3[4];
      
      misempleados[0] = new empleado3("PACO GOMEZ " , 8500,1990,12,17);
      
      misempleados[1] = new empleado3("ANA LOPEZ " , 9500,1995,06,02);
      
      misempleados[2] = new empleado3("MARIA MARTIN " , 105,2002,03,15);
      
      misempleados[3] = new empleado3("ANTONIO FERNANDEZ ");
      
       for(empleado3 e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(empleado3 e:misempleados){
          
          System.out.println("NOMBRE: " + e.dameNombre() + 
                  "SUELDO: " + e.dameSueldo()+ " FECHA DE ALTA " +
                  e.dameFechaContrato());
      }
    }
    
}
