/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf02ClassObject;

/**
 *
 * @author Zakaria Ahmmed
 */
public class CreateClassObject3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Class cls = employee.getClass();
        System.out.println("name"+cls.getName());
    }
}
