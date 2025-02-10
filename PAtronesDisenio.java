/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdisenio;

/**
 *
 * @author Computo00379
 */
public class PAtronesDisenio {

    
    public static void main(String[] args) {
      Singleton a=Singleton.getInstancia();
      a.mostrar();
       
      Singleton b=Singleton.getInstancia();
      b.mostrar();
    }
    
}
