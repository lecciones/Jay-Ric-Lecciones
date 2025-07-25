
package lecciones;

import java.util.Scanner;


public class Lecciones {

   
    public static void main(String[] args) {
       
        
    Scanner sc = new Scanner(System.in);
       
       String name, remarks;
       int science, history, math, soc, arts, total;
       double percent;
       
       System.out.println("Enter Name: ");
       name = sc.nextLine();
       
       System.out.println("Enter Marks in Science: ");
       science = sc.nextInt();
       
       System.out.println("Enter Marks in History: ");
       history = sc.nextInt();
       
       System.out.println("Enter Marks in History: ");
       math = sc.nextInt();
       
       System.out.println("Enter Marks in Soc: ");
       soc = sc.nextInt();
       
       System.out.println("Enter Marks in Arts: ");
       arts = sc.nextInt();
       
       total = science + history + math + soc + arts;
       percent = total / 5.0;
       
       if (percent >= 91){
           remarks = "Excellent";
       }else if (percent >= 86){
           remarks = "Very Good";
       }else if(percent >= 81){
           remarks = "Good";
       }else if (percent >= 76){
           remarks = "Fair";
       }else if (percent >= 71){
           remarks = "Poor"
       }else{
           remarks = "Fail";
       }
       
       System.out.println("===Student Grade===");
        System.out.println("Name: "+name);
       System.out.println("\nTotal Marks: "+total);
       System.out.println("Total percentage: "+percent);
       System.out.println("Remarks: "+remarks);
       
       if (percent > 70){
           System.out.println("Congrats "+name+" you Passed.");
       }else{
           System.out.println("Try again!");
           
       }
    }
    
}
