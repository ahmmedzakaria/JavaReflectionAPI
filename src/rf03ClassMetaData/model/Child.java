/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf03ClassMetaData.model;

/**
 *
 * @author Zakaria Ahmmed
 */

@Deprecated
public class Child extends Parent implements Showable{
    private int value;

    public Child(String name , int value) {
        super(name);
        this.value = value;
    }
    @Override
    public void showValue() {
        System.out.println("Value is :" + value);
    }
    
}
