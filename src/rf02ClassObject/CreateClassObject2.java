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
public class CreateClassObject2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("rf02ClassObject.Employee");
        System.out.println("name"+cls.getName());
    }
}
