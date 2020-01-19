/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf03ClassMetaData.model;

import java.io.Serializable;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Parent implements Serializable{
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void displayName(){
        System.out.println("Name is: " + name); 
    }
    
    private void privateMethod(){
        System.out.println("Private Method: " + name); 
    }
}
