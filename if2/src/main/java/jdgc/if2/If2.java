/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jdgc.if2;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class If2 {

    public static void main(String[] args) {
// Voy a la discoteca y si soy mayor de 18 años. Si tengo dinero me pido una Coca Cola
// Ponen a DJ Tiesto  y me pongo a bailar. SI NO soy mayor, me voy al cine.
// Si esta Resident Evil la veo y SINO, me voy a la bolera. Antes de irme del cine,
// me tomo un helado
cajon1();
    }
    public static void cajon1(){
        System.out.println("Welcome to the Mae West Granada");
        
        System.out.println("How old are you?");
        byte age;
        Scanner keyboard = new Scanner (System.in);
        age = keyboard.nextByte();
        
        System.out.println("How much money have on your wallet?");
        byte wallet;
        wallet = keyboard.nextByte();
        
        if (age >= 18) {       
    byte entrance = 15;
    if (wallet >= entrance && age>=18) {
        System.out.println("Pay the entrance, It's 15€");
    } else {
        System.out.println("You don't have enough money");
        if (age<18){
           }else{ 
            System.out.println("You can't pass to the Mae West"); 
        }
    }
}
        if (wallet>=3){
            byte cocaCola = 3;
            if ( wallet>=cocaCola){
                System.out.println("Take your CocaCola, go dance!");
            }else{
                System.out.println("You can't pay the Cocacola");
                
            }
        }
        }
        
        }
    
            
            
        
       
       
        
            
        
    
