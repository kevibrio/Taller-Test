/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elena
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCsWorkerUsd() {
        System.out.println("cs");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Worker);
        float expResult = 464.33334F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCsSupervisorUsd() {
        System.out.println("cs");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Supervisor);
        float expResult = 467.83334F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCsManagerUsd() {
        System.out.println("cs");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Manager);
        float expResult = 471.33334F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonusWorkerUsd() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Worker);
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testCalculateYearBonusSupervisorUsd() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Supervisor);
        float expResult = 593.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testCalculateYearBonusManagerUsd() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400, "USD", 10,EmployeeType.Manager);
        float expResult = 786.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0); 
    }
    
}
