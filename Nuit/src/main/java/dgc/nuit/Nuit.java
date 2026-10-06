/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgc.nuit;

import java.util.Scanner;

/**
 *
 * @author vegge
 */
public class Nuit {

    public static void main(String[] args) {
       NuitFilter();
        NuitEntry();
    }
    public static void NuitFilter(){
        System.out.println("Bienvenidos a La Nuit Pub");
        System.out.println("Porfavor introduzca su edad: ");
        Scanner keyboard = new Scanner(System.in);
        
        byte age; 
        age =  keyboard.nextByte();
        
        if (age >= 18){
            System.out.println("Puedes entrar a La Nuit Pub");
        } else{
            System.out.println("No puedes entrar a La Nuit Pub");           
        }
        
        
        
    }
    public static void NuitEntry(){
         System.out.println("¿Tienen entrada?");
         Scanner nE = new Scanner (System.in);
                        
         char nuitEntrance;
         nuitEntrance = nE.next().charAt(0);
         
         if (nuitEntrance == 's'){
             System.out.println("Disfrute de la noche");
         } else{
             System.out.println("No puede entrar sin la entrada reglamentaria");
         }
    }
    public static void DeniedEntry21(){
        
}
}
    

    

