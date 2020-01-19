/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf06CreateInstanceUsingConstructor.model;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Student {
    private int id;
    private String name;


    private Student() {
        System.out.print("I am Private ): ");
    }

    
    
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetail() {
        System.out.println( "Student{" + "id=" + id + ", name=" + name + '}'+"\n");
    }
    
    
}
