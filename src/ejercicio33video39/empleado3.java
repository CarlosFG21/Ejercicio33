
package ejercicio33video39;

import java.util.*;

public class empleado3 {
    
    public empleado3(String nom,double sue,int agno,int mes,int dia){
      
        nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
  }
    
    public empleado3(String nom){
        
        this(nom, 30000,2000,01,01);
        
    }

    empleado3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public String dameNombre(){
      
      return nombre;
  }  
  
  public double dameSueldo(){ //geter
      
      return sueldo;
  }
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  
    
}
