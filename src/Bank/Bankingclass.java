
package Bank;


public class Bankingclass {
   
    int accountNo = 20013, pin = 456789;
    String name;
    float initializeBalance = 0;
    
    public boolean validateAccount(int accn, int pi){
        
        if(accn == accountNo && pi == pin){
            return true;
        }else{
            return false;
        }
    }
    
    public int listAccount(){
        return accountNo;
    }
    
    
    
    
    
    public void viewBalance(){
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
