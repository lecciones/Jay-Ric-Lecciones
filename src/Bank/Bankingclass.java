
package Bank;


public class Bankingclass {
   
    private int accountNo, pin;
    private float initializeBalance;
    
    
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    
    public int getAccountNo(){
        return accountNo;
    }
    
    public void setPin(int pin){
        this.pin = pin;
    }
    
    public int getPin(){
        return pin;
    }
   
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
