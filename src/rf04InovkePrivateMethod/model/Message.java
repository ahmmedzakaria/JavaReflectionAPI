/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf04InovkePrivateMethod.model;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Message {
    private void message(String msg){
        System.out.println(":::Massage:::\n"+ msg);
    }
    
    private String returnMessage(String msg){
        return msg;
    }
}
