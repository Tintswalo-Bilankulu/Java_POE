
package st10211539;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login {
    String enteredUserName; 
    String enteredPassword; 
      
    
  
    /*This method ensures that any username contains an under score (_) and is no more than 5 letters*/
    public  boolean checkUserName(){
        
        return (Registration.getUserName().contains("_") && Registration.getUserName().length() <= 5);
        
    }
    
    /*This method ensures that passwords meet the following password complexity rules, the password must meet the requirements */
    public boolean checkPasswordComplexity(){
       
        boolean isUpper = false ;        
        boolean isSpecialCharacter = false ;
        boolean isNumber = false;
        char currentCharacter; 
        
          if (Registration.getPassword().length() >= 8) {
               
            
            
            for (int i = 0; i < Registration.getPassword().length(); i++) {
              
                currentCharacter = Registration.getPassword().charAt(i);  
                if (Character.isUpperCase(currentCharacter)) {
                    isUpper = true;
                } else if (Character.isDigit(currentCharacter)) {
                    isNumber = true;
                } else if (!(Character.isLetterOrDigit(currentCharacter))) {
                    isSpecialCharacter = true;
                }
                
                }
            }

      
    
           return (isUpper && isNumber && isSpecialCharacter);   
    }
   
   /*This method returns the necessary registration messaging indicating if the password and the username are formatted properly or not*/
 public String registerUser(){
     
     String nameoutput;
     String passwordoutput;
     
     if (checkUserName()){
         nameoutput = "Username successfully captured; ";
     }
     else{
         nameoutput = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
     }
     
     if(checkPasswordComplexity()){
         passwordoutput = "Password successfully captured.";
     }
     else{
        passwordoutput = " Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
     }
    return passwordoutput + "\n" + nameoutput;
 }
 /*This method verifies that the login details entered matches the login details stored when the user registers. */ 
 public boolean loginUser(){
     
   
      
    
     enteredUserName =JOptionPane.showInputDialog("Enter the user name you used to create an account");
       
      enteredPassword =JOptionPane.showInputDialog("Enter the password you used to create an account");
      
     
     
     
     return Registration.getUserName().equals(enteredUserName) && Registration.getPassword().equals(enteredPassword);
           
 }
 
  /*This method returns the necessary messaging for a successfull login or a failed login*/
 public String returnLoginStatus(){
      
      
      
    
        if(loginUser()){
        return "Welcome " + Registration.Firstname + " " + Registration.Surname + " it is great to see you again.";
    }
    else{
        return "Username or password incorrect, please try again.";
 }
}
}
