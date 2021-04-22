/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author starco
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        
        System.out.println("ingrese el primer numero:");
        int numero1=scn.nextInt();
        System.out.println("ingrese segundo numero");
        int numero2=scn.nextInt();
        
        if(numero1==numero2){
        System.out.println("son iuales");
       
    } else if (numero1>numero2){
        System.out.println("el numero mayor es: "+numero1);
        }else{
        System.out.println("el numero mayor es: "+numero2);
        
          System.out.println("-----------[ejercicio 2]--------------------------");
          
           Scanner entrada=new Scanner(System.in);
        System.out.println("primer numero: " );
        int n1=entrada.nextInt();
        System.out.println("segundo numero: ");
        int n2=entrada.nextInt();
        
         int mayor=n1;
        int menor=n1;
        
        if (mayor<n2){
             mayor=n2;
        }     
        if (menor>n2){  
            menor=n2;
        }
            System.out.println("mayor : " +mayor );
            System.out.println("menor : " +menor );
            
            System.out.println("-----------[ejercicio 3]--------------------------");
            
         Scanner entr=new Scanner(System.in);      
        System.out.println("Primer número: " );
        int nu1=entr.nextInt();
        System.out.println("Segundo número: ");
        int nu2=entr.nextInt();
        
        if (nu1>nu2){
        System.out.println("El primer número es mayor ");
                 
       
    } else if (nu1==nu2){
        System.out.println("Ambos números son iguales");
        }else{
        System.out.println("El segundo número es mayor");
    }
        
           System.out.println("-----------[ejercicio 4]--------------------------");
           
             int añoact=2021;
        int añoant=1980;
        int resta;
        resta=añoact-añoant;
        
        System.out.println(" desde "+ añoant + " hasta "+ añoact + " han pasado "+resta + " años ");
        
           System.out.println("-----------[ejercicio 5]--------------------------");
           
         Scanner ent=new Scanner(System.in); 
        System.out.println("Introduzca un número cualquiera: ");
         int Num=ent.nextInt();
         
         if (Num>=0) {
             System.out.println("Es positivo");
         }
         else {
         System.out.println("Es negativo");
         
         System.out.println("-----------[ejercicio 6]--------------------------");
       
         int c;
        Scanner val=new Scanner(System.in);
         System.out.println("Introduzca un número: ");
          c=val.nextInt();
         
         if (c<10){
         System.out.println("Distinto de dos cifras");
         }
         else if (c<100){
         System.out.println("Tiene dos cifras");
         }
           
        
        
            
            
        
       
        
        
        
        // TODO code application logic here
    }
    
         }
    }
    }


   
   
    
    
   

        