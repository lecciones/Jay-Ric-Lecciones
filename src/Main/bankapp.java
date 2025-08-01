
package Main;

import Bank.Bankingclass;
import java.util.Scanner;


public class bankapp {
    
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What is your choice for today!?");
        System.out.println("1.Banking");
        System.out.println("2.Doctors Appointment");
        System.out.println("3.Shopping");
        
        System.out.print("Enter Choice: ");
        int choice = sr.nextInt();
        
        switch(choice){
            case 1:
                Bankingclass bs = new Bankingclass();
                
               int attempts = 3;
               
                while(attempts > 0){
                    
                    System.out.print("Enter Account No: ");
                    int accountNo = sr.nextInt();
                    
                    System.out.println("Enter Pin: ");
                    int pin = sr.nextInt();
                    
                    if(bs.validateAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESSFULLY");
                        
                        break;
                        
                    }else{
                        attempts--;
                        System.out.println("LOGIN FAILED!");
                        System.out.println("Remaning Attempts "+attempts);
                        
                        if(attempts ==0){
                            System.out.println("Max Attempts reached.");
                            System.out.println("Access Denied");
                        }
                    }
                        
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                
        }
    }
}
