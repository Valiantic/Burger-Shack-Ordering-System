
package com.mycompany.first_crud_ordering_system;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class First_CRUD_Ordering_System {

    public static void main(String[] args) {
        
        Scanner scans = new Scanner(System.in);
        
        System.out.println("--WELCOME TO BURGER SHACK--");       
        System.out.println("");
        System.out.println("");
        System.out.println("Where the juicy burger exist!");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1 to Order Now");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 2 to Exit");
        System.out.println("");
        int enter = scans.nextInt();
        
        if(enter == 1){
            Scanner stringscans = new Scanner(System.in);
        System.out.println("");
        System.out.println("--Enter customer's name--");     
        String name = stringscans.nextLine();
        System.out.println("");
        
        System.out.println("Hello There! " + name + " can we know what is your order?");         
        System.out.println("");
        System.out.println("");
        System.out.println("--1. ROYAL BLUE BURGER $14.99 --");      
        System.out.println("");
        System.out.println("--2. VEGGIE DELIGHT BURGER $12.49 --");      
        System.out.println("");
        System.out.println("--3. SMOKY BBQ BACON BURGER $13.99 --");      
        System.out.println("");
        System.out.println("--4. HAWAIIAN LUAU BURGER $11.99 --");      
        System.out.println("");
        System.out.println("--5. GORMET MEDITERRANEAN BURGER $15.49 --");      
        System.out.println("");
        int order = scans.nextInt();
        System.out.println("");
        
       
        if(order == 1){
        System.out.println("Your order is ROYAL BLUE BURGER at $14.99");         
        System.out.println("");
        System.out.println("Quantity");         
        System.out.println("");
        int quan = scans.nextInt();
        
        double cost = 14.99 * quan;
        
        System.out.println("That would be " + cost);
        System.out.println("");
        
        try{
        Thread.sleep(400);
        System.out.println("Please enter your payment ");
        int pay = scans.nextInt();
        
        if(pay >= cost){
        double total = pay - cost;
        
        System.out.println("Thank you for ordering ROYAL BLUE BURGER here is your exchange " + total);
        
        }
        else{
            
           System.out.println("I'm Sorry but your balance did not meet the price for your order ");
            
        }
        
        
        }
        catch(Exception e){
        
        }
        
        
        }
        else if(order == 2){
        System.out.println("Your order is VEGGIE DELIGHT BURGER $12.49");         
        System.out.println("");
        System.out.println("Quantity");         
        System.out.println("");
        int quan = scans.nextInt();
        
        double cost = 12.49 * quan;
        
        System.out.println("That would be " + cost);
        System.out.println("");
        
        try{
        Thread.sleep(400);
        System.out.println("Please enter your payment ");
        int pay = scans.nextInt();
        
        if(pay >= cost){
        double total = pay - cost;
        
        System.out.println("Thank you for ordering VEGGIE DELIGHT BURGER here is your exchange " + total);
        
        }
        else{
            
           System.out.println("I'm Sorry but your balance did not meet the price for your order ");
            
        }
        
        
        }
        catch(Exception e){
        
        }
        }
        else if(order == 3){
        System.out.println("Your order is SMOKY BBQ BACON BURGER $13.99");         
        System.out.println("");
        System.out.println("Quantity");         
        System.out.println("");
        int quan = scans.nextInt();
        
        double cost = 13.99 * quan;
        
        System.out.println("That would be " + cost);
        System.out.println("");
        
        try{
        Thread.sleep(400);
        System.out.println("Please enter your payment ");
        int pay = scans.nextInt();
        
        if(pay >= cost){
        double total = pay - cost;
        
        System.out.println("Thank you for ordering SMOKY BBQ BACON BURGER here is your exchange " + total);
        
        }
        else{
            
           System.out.println("I'm Sorry but your balance did not meet the price for your order ");
            
        }
        
        
        }
        catch(Exception e){
        
        }
        }
        else if(order == 4){
        System.out.println("Your order is HAWAIIAN LUAU BURGER $11.99");         
        System.out.println("");
        System.out.println("Quantity");         
        System.out.println("");
        int quan = scans.nextInt();
        
        double cost = 11.99 * quan;
        
        System.out.println("That would be " + cost);
        System.out.println("");
        
        try{
        Thread.sleep(400);
        System.out.println("Please enter your payment ");
        int pay = scans.nextInt();
        
        if(pay >= cost){
        double total = pay - cost;
        
        System.out.println("Thank you for ordering HAWAIIAN LUAU BURGER here is your exchange " + total);
        
        }
        else{
            
           System.out.println("I'm Sorry but your balance did not meet the price for your order ");
            
        }
        
        
        }
        catch(Exception e){
        
        }
        }
        else if(order == 5){
           System.out.println("Your order is GORMET MEDITERRANEAN BURGER $15.49");         
        System.out.println("");
        System.out.println("Quantity");         
        System.out.println("");
        int quan = scans.nextInt();
        
        double cost = 15.49 * quan;
        
        System.out.println("That would be " + cost);
        System.out.println("");
        
        try{
        Thread.sleep(400);
        System.out.println("Please enter your payment ");
        int pay = scans.nextInt();
        
        if(pay >= cost){
        double total = pay - cost;
        
        System.out.println("Thank you for ordering GORMET MEDITERRANEAN BURGER here is your exchange " + total);
        
        }
        else{
            
           System.out.println("I'm Sorry but your balance did not meet the price for your order ");
            
        }
        
        
        }
        catch(Exception e){
        
        }
        }
        else{
        System.out.println("Invalid order");
        System.exit(0);
        }
      
      
   
        
        }
        else{
            
             System.out.println("Be sure to comeback later!");
            
        System.exit(0);
        }
        
        
    }
}
