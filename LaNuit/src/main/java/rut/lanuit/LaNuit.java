/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rut.lanuit;

import java.util.Scanner;

/**
 *
 * @author Rut Galera
 */
public class LaNuit {

    public static void main(String[] args) {
        NuitFilter();
   
    }
    public static void NuitFilter(){
        System.out.println("Bienvenidos a La Nuit Pub");
        System.out.println("Porfavor introduzca su edad: ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Tienen entrada?");
       
        char nuitEntrance;
        boolean hasTicket = false;
        nuitEntrance = keyboard.next().charAt(0);
         
        if (nuitEntrance == 's' || nuitEntrance == 'S'){
             hasTicket = true;
        }      
        byte age; 
        age =  keyboard.nextByte();
        
        if (age >= 18 &&  hasTicket == true){
            System.out.println("Puedes entrar a La Nuit Pub, me pongo a bailar ");
            if (age > 21){
                System.out.println("Te vas a pegar un colocón");
            }
            if ( age == 20 || age == 21){
                System.out.println("Eres un ludópata");
            }
        } else{
            if ( age < 18){
                System.out.println("Vete a tomar un helado");
            }else 
                System.out.println("Pilla el coche y vete al bonobo de motril");
            System.out.println("No puedes entrar a La Nuit Pub");           
        }
    
    }
     

}
