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
public class StoreAndDisplayTest {
     StoreAndDisplay StoreAndDisplayObject = new StoreAndDisplay();
    String developer = "Samantha Paulson";
    public StoreAndDisplayTest() {
    }

    @Test
    public void testManipulateArrays () {
        String[] dev = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] t_name = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] id = new String[]{};
        String[] status = new String[]{"To Do", "Doing", "Done", "To Do"};
        int[] duration = new int[]{5, 8, 2, 11};
        
        StoreAndDisplayObject.manipulateArrays(dev, t_name, id, status, duration);
        
    }

    @Test
    public void testDoneTasks() {
        
    }

    @Test
    public void testLongestTask() {
        String expected = "Glenda Oberholzer, 11";
        String actual = StoreAndDisplayObject.longest;
    }

    @Test
    public void testSearchTask() {
        String expected = "Create Login, Mike Smith, To Do";
        String actual = StoreAndDisplayObject.searchTask("Create Login");
    }

    @Test
    public void testDeveloperTasks() {
        String expected = "Create Reports, Done";
        String actual = StoreAndDisplayObject.developerTasks("Samantha Paulson");
    }

    @Test
    public void testDeleteTask() {
        String expected = "Task Create reports successfully deleted";
        String actual = StoreAndDisplayObject.deleteTask("Create Reports");
    }

    @Test
    public void testDisplayReport() {
    }

}
