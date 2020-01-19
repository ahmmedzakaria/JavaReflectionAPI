/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf02ClassObject;

import java.io.Serializable;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Employee implements Serializable, Cloneable{
     static int empId =8768;
     static String empName= "Zakaria Ahmmed";
     static String empAddress = "Gazipur";

    public Employee() {
    }
     
    public Employee(String empAddress) {
        this.empAddress = empAddress;
    } 
     
     
     public String detailInfo(){
         return empName+ " " +empId;
     }
     
     void sum(int num1, int num2){
         System.out.println("Total:" +(num1+num2));
     }
    
}
