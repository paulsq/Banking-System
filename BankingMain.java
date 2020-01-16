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
public class BankingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //create customer1
        Account customer1 = new Account();
        customer1.deposit(500);
       
        
        //create customer2
        Account customer2 = new Account();
        customer2.deposit(100);
        
       System.out.print("customer1 has a balance of ");
       System.out.println(customer1.getBalance());
       System.out.print("customer2 has a balance of ");
       System.out.println(customer2.getBalance()); 
               
    }
    
}
