

package com.mycompany.expresiones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.mvel2.MVEL;

public class Expresiones {

    public static void main(String[] args) {
        String e="7*9+12";
       String e2="7>9";

      System.out.println(MVEL.eval(e));
        System.out.println(MVEL.eval(e2));

        //Operaciones Basicas
  BigInteger num1=new BigInteger("111111234554435444354354354354354353253534525432");
  BigInteger num2=new BigInteger("1324343333425432543254354325432543543254325432");
  BigInteger resultado=num1.add(num2);
  BigInteger resultado2=num1.multiply(num2);
  
  BigDecimal num3=new BigDecimal("111111234554435444354354354354354353253534525432.0");
  BigDecimal num4=new BigDecimal("1324343333425432543254354325432543543254325432.0");
  BigDecimal resultado3=num4.divide(num3,100,RoundingMode.UP);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        
        
        //Clases estaticas y metodos estaticos
        //usados en conexiones de BD
        //Metodos sin parametro o con parametro
        //para constantes
        System.out.println(Conexion.conexion);
        System.out.println(Conexion.email);
       Conexion.sumar(13, 12);
       Conexion.sumar(123, 132);
    }
}
