/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.p2_testingentries;

import java.util.Scanner;
/**
 *
 * @author usuariom
 */
public class P2_TestingEntries {

    public static void main(String[] args) {
       
        sexchar();
  }
    //otro cajon
    public static void test1(){
        //        System.out.println("Hello World!");
// Voy a leer una edad
        System.out.println("Please, type your age");
        byte age;

//leer de teclado
        Scanner keyboard = new Scanner(System.in);
        age = keyboard.nextByte();
//muestro la edad por pantalla
        System.out.println("Your age is " + age);

        System.out.println("Please, type your second age");
        byte age2;
        age2 = keyboard.nextByte();

        System.out.println("Please, type your third age");
        byte age3;
        age3 = keyboard.nextByte();

        int result2 = age * age2 / age3;

//muestro el resultado de la suma por pantalla
        System.out.println("The addition result is " + result2);

        System.out.println("Please, type your salary: ");
        double salary;
        salary = keyboard.nextDouble();

        System.out.println("Your salary is: " + salary);

        System.out.println("What is your fucking name ");
        String name1;
        name1 = keyboard.next();

        System.out.println("Your  name is: " + name1);
//Limpio el buffer
        keyboard.nextLine();

        System.out.println("Now your surname: ");
        String name2;
        name2 = keyboard.nextLine();

        System.out.println("Your surname is: " + name2);

    }
    public static void agesisters(){
        //Pedir por teclado 2 nombres, 2 edades y luego mostrar los nombres y la suma de las 2 edades        
        String name;
        String name1;
        byte age; 
        byte age1;
              
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Type older sister's age first: ");
        age = keyboard.nextByte();
        
        System.out.println("Type the second sister's age: ");   
        age1 =  keyboard.nextByte();
        
        keyboard.nextLine();
        
        System.out.println("Now type the name's older sister: ");
        name = keyboard.nextLine();
        
        System.out.println("Type second sister's name");
        name1 = keyboard.nextLine();
        
        int addition = age + age1;
        
        System.out.println("The names are: " + name + " and " + name1);
        System.out.println("Child's addition age is: " + addition);      
    }
    public static void sexchar(){
        System.out.println("Which is your sex?");
        
        char sex;
        
        Scanner keyboard = new Scanner (System.in);
        
        sex = keyboard.next().charAt(0);
        System.out.println("Your sex is " + sex);
        
        System.out.printf("There are 2 sister whose names are %s and %s. Their "
        + "age are % and % respectively and it addition is %", name,name2,age,age2,addition);
        
        byte name;
        name = keyboard.nextByte();
        byte name2;
        name2 = keyboard.nextByte();
        short age;
        age = keyboard.nextByte();
        short age2;
        age2 = keyboard.nextByte();
       
        int addition = age + age2;
    }
}


