/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdisenio;



public class Singleton {
private static  Singleton instancia;

private Singleton(){}

public static Singleton getInstancia(){
    if(instancia==null){
        instancia=new Singleton();
        System.out.println("instancia creada");
    }
    return instancia;
}
public void mostrar(){
    System.out.println("instamcia corriendo");
}

}
