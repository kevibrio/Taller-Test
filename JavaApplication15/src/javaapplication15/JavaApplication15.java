/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author kevin
 */
public class JavaApplication15 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //example
            Employee e = new Employee(400, "USD", 10,EmployeeType.Worker);
            float a = e.cs();
            float b = e.CalculateYearBonus();
            //salario  currency USD
            //caso 1 empleado tipo worker
            //caso 1 empleado tipo supervisor
            //caso 1 empleado tipo manager
            
            //salario currency otro tipo ej (EUR)
            //caso 2 empleado tipo worker
            //caso 2 empleado tipo supervisor
            //caso 2 empleado tipo manager
            
            //caso 3,  salario 0, bonus 0
            //caso 4, salario 0, bonus diferente  a 0
            //caso 5, salario diferente  a 0, bonus 0
            //caso USD  esta con  minuscula
        }catch(Exception E){}
        
    }
    
}
