
package st10211539;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class StoreAndDisplay {
  static String done;
    static String longest; 
    static String tasksIdentified;
    static String developertasks;
    static String deleted;
    static String devNames; 
    static String Namesearch; 
    static String taskname;
    static String report;
    
    
    static int option = 0;
    static String choice;
    
    static int size = TaskFeature.getNumberOfTasks();
    
    static String[] developerNames = new String[size];/*Contains the names of all the developers assigned to tasks */
    static String[] taskNames = new String[size];/*Contains the names of all the created tasks*/
    static String[] taskIDs = new String[size];/*Contains the generated taskID’s for all tasks*/
    static String[] taskStatus =new String[size];/*Contains the Duration of all tasks*/
    static int[] taskDuration = new int[size];/*Contains the Status of all tasks*/
    
  
    public static void manipulateArrays(String developerName[], String taskName[], String taskID[], String[] status, int duration[]){
     
        System.arraycopy(developerName, 0, developerNames, 0, size);
        System.arraycopy(taskName, 0, taskNames, 0, size);
        System.arraycopy(taskID, 0, taskIDs, 0, size);
        System.arraycopy(status, 0, taskStatus, 0, size);
        System.arraycopy(duration, 0, taskDuration, 0, size);
        
        /*Display the Developer, Task Names and Task Duration for all tasks with the status of done.
b. Display the Developer and Duration of the class with the longest duration.
c. Search for a task with a Task Name and display the Task Name, Developer and Task 
Status.
d. Search for all tasks assigned to a developer and display the Task Name and Task 
Status.
e. Delete a task using the Task Name.
f. Display a report that lists the full details of all captured tasks.*/
        
        option = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              All task details have been captured.
                                                              Type 1 to operate on the captured data or 0 to quit"""));
        do{
            choice = JOptionPane.showInputDialog("Pick\n"
                    + "a. Display the list of all tasks with the status of done\n"
                    + "b. Display the name of the developer whose task takes the longest to complete\n"
                    + "c. To search for a Task\n"
                    + "d. Display the list of tasks assigned to a developer\n"
                    + "e. To delete a task\n"
                    + "f. Display a report to see lists the full details of all captured tasks.");
            
            switch(choice){
                case "a": 
                    doneTasks();
                    break;
                case "b":
                    longestTask();
                    break;
                case "c":
                    Namesearch = JOptionPane.showInputDialog("What are the names of the task you want to be searched");
                    searchTask(Namesearch);
                    break;
                case "d":
                    devNames = JOptionPane.showInputDialog("What are the developers full names");
                    developerTasks(devNames);
                    break;
                case "e":
                    taskname = JOptionPane.showInputDialog("What are the name of the task to be deleted");
                   deleteTask(taskname);
                    break;
                case "f":
                    displayReport();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input");
                    
            }
        
           
            option = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to continue operating on the data and 0 to stop"));
            
        }while(option == 1);

        
    }
    
    public static void doneTasks(){
        
        for(int i = 0; i < size; i++){
            if(taskStatus[i].equals("Done")){
                done = (developerNames[i]+", "
                        +taskNames[i]+ ", "
                        +taskDuration[i]);
            }
        }
        JOptionPane.showMessageDialog(null, done);

    }
    
    
    public static void longestTask(){
        int maximum;
        maximum = taskDuration[0];
        int position = 0; 
        for(int i = 0; i < size; i++){
            
            if(taskDuration[i] > maximum){
                maximum = taskDuration[i];
                position = i;
            }                        
        }
        
         longest = (developerNames[position]+ ", " + maximum);
         JOptionPane.showMessageDialog(null,longest);
        
    }
    
    
    public static String searchTask(String NameFind){
        NameFind = Namesearch;
        for(int i = 0; i < size; i++){
            if(taskNames[i].equals(NameFind)){
                tasksIdentified = (taskNames[i] + ", " + developerNames[i] +", "+ taskStatus[i]);

                
            }
            else{
                tasksIdentified = "Task not found";
            }
        }
        JOptionPane.showMessageDialog(null, tasksIdentified);
        return NameFind;

    }
    
    
    public static String developerTasks(String developer){
        developer = devNames;
        for(int i = 0; i < size; i++){
            if(developerNames[i].equals(devNames)){
               developertasks = (taskNames[i] + ", " + taskStatus[i]);
               i = size; // this line will terminate the loop when a developer name is found
            }
            else{
                developertasks = "Developer name not found";
            }
        }
        JOptionPane.showMessageDialog(null, developertasks);
        return developertasks;

    }
    
    public static String deleteTask(String task){
        task = taskname;
        int deleteIndex;
        
        for(int i = 0; i < size; i++){
            
            if(taskNames[i].equals(task)){
               deleteIndex = i;
               
               deleted = ("Task " + taskNames[i] + " successfully deleted.");
               
                taskNames[deleteIndex] = "";
                
                developerNames[deleteIndex] = "";
                
                taskIDs[deleteIndex] = "";
                
                taskStatus[deleteIndex] = "";
                
                taskDuration[deleteIndex] = 0;
                
                i = size;
            }
                         
        }
        JOptionPane.showMessageDialog(null,deleted);
        return deleted;
    }
    public static void displayReport(){
        for(int i = 0; i < size; i++){
            if(!"".equals(taskNames[i]) && taskDuration[i] != 0){
                report = (taskNames[i] + "\n"
                        +developerNames[i]+ "\n"
                        + taskIDs[i] + "\n"
                        + taskStatus[i] +"\n"
                        + taskDuration[i] + "\n");
            } 
            JOptionPane.showMessageDialog(null, report);
        }
    }  
}
