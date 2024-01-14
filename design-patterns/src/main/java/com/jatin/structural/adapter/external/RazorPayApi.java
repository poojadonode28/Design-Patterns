package com.jatin.structural.adapter.external;

// Step 1 - Create external classes (Incompatible interface)
public class RazorPayApi {
    public void pay(String name, int amount){
        System.out.println("Razor pay payment: " + name + " " + amount);
    }
    public int checkStatus(){
        return 1; //SUCCESS
    }

}
