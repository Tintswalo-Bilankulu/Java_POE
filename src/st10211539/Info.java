/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10211539;

/**
 *
 * @author lab_services_student
 */
public class Info {
     static TaskFeature infoObject = new TaskFeature();
    
   
    public static boolean checkTaskDescription(){
        final int DESCRIPTION_LENGTH = 50;
        if(infoObject.getTaskDescription().length() <= DESCRIPTION_LENGTH){
            return true;
        }
        else{
            return false;
        }
    }
    
  
    /*The system must autogenerate a TaskID which contains the first two letters of the Task Name, a colon (:), the Task Number, a colon (:) and the last three letters of the developer assigned to the task’s name. The ID should be 
displayed in all caps*/
    public static String createTaskID(){
        
        /*
          
        */
        String lastThreeLetters = "";
        String id; 
        char ch; 
        
        for(int i = 0; i < infoObject.getDeveloperNames().length(); i++){
            
            ch = infoObject.getDeveloperNames().charAt(i);
            
            if(ch == ' '){
                lastThreeLetters = infoObject.getDeveloperNames().substring(i-3, i);
            }
        }
       
        
        
        id =  infoObject.getTaskName().substring(0, 2) + ":" +infoObject.getNumberOfCurrentTask() +
        ":" + lastThreeLetters;
   

    return id.toUpperCase();
    }
    
    
    public static String printTaskDetails(){
        return infoObject.getTaskStatus() + "\n" + infoObject.getDeveloperNames() + "\n" +  
                infoObject.getNumberOfCurrentTask() + "\n" + infoObject.getTaskName() + "\n" +
                infoObject.getTaskDescription() + "\n" +createTaskID() + "\n" + infoObject.getTaskDuration();
    }
    
    
    public static int returnTotalHours(){
        
        return infoObject.totalHours;
    }   

    
}
