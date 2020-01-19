/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf04InovkePrivateMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import rf04InovkePrivateMethod.model.Message;
import util.Util;

/**
 *
 * @author Zakaria Ahmmed
 */
public class InvokePrivateMethod {
    public static void main(String[] args) 
            throws NoSuchMethodException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        Class cls = Message.class;
        Method method =cls.getDeclaredMethod("returnMessage", String.class);
        method.setAccessible(true);
        String msg = (String)method.invoke(cls.newInstance(), "Hello");
        Util.print(msg, "Message");
        
        Util.print(Arrays.asList(cls.getDeclaredMethods()),
                "All Method of "+cls.getSimpleName()+" class");
    }
}
