/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

/**
 *
 * @author paulsq
 */
public class Account {
    private double balance; 
    
    //set balance to 0.00
    public Account(){
        balance = 0.0;             
        
    }
    // deposit 
    public void deposit(double amount) {
        balance = balance + amount;             
        
    } 
    
    //withdraw
     public void withdraw(double amount) {
         if(amount<=balance){
         balance = balance - amount;             
        }else{
             System.err.println("Transaction cannot be completed due to insufficient fund");
         }
     }
    //get balance
     public double getBalance() {
        return balance; 
     }  
     }

