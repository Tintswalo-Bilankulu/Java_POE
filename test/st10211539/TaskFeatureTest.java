/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10211539;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class TaskFeatureTest {
    
    TaskFeature TaskFeature  =new TaskFeature();
     
    public TaskFeatureTest() {
       
     
    }

    @Test
    public void testSetTaskName() {
        String expected="Login Feature";
        String actual= TaskName.GetTaskName();
    }

   
  

    @Test
    public void testGetNumberOfTasks() {
        Int expected= 2;
        Int actual= NumberOfTasks.GetNumberOfTasks;
    }

   

    @Test
    public void testGetTaskDuration() {
        Int expected= 8;
        Int actual= TaskDuration.GetTaskDuration;
    }


   
    @Test
    public void testDescriptionStatus() {
        String expected="Create Login to authenticate users";
        String actual= DescriptionStatus.GetDescriptionStatus;
    }

    

    @Test
    public void testGetDeveloperNames() {
        String expected="Robyn Harrison ";
        String actual= DeveloperNames.GetDeveloperNames;
        
    }

   

    @Test
    public void testGetTaskStatus() {
        String expected="To Do";
        String actual= TaskStatus.GetTaskStatus;
    }

    @Test
    public void testGetTaskName() {
    }

    @Test
    public void testGetChosenOPtion() {
    }

    @Test
    public void testSetNumberOfTasks() {
    }

    @Test
    public void testSetTaskDuration() {
    }

    @Test
    public void testSetTaskDescription() {
    }

    @Test
    public void testGetTaskDescription() {
    }

    @Test
    public void testSetDeveloperNames() {
    }

    @Test
    public void testSetTaskStatus() {
    }

    @Test
    public void testSetNumberOfCurrentTask() {
    }

    @Test
    public void testGetNumberOfCurrentTask() {
    }

    @Test
    public void testAddTasks() {
    }

    @Test
    public void testWelcomeToEasyKanbanOption() {
    }
}
