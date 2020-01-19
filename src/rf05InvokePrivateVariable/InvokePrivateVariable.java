/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf05InvokePrivateVariable;

import java.lang.reflect.Field;
import java.util.Arrays;
import rf05InvokePrivateVariable.model.Message2;
import util.Util;

/**
 *
 * @author Zakaria Ahmmed
 */
public class InvokePrivateVariable {
    public static void main(String[] args)
            throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        
        Class cls = Message2.class;
        Field field =cls.getDeclaredField("massage");
        field.setAccessible(true);
        String msg = (String)field.get(cls.newInstance());
        Util.print(msg, "Message");
        
        Util.print(Arrays.asList(cls.getDeclaredFields()),
                "All Fields of "+cls.getSimpleName()+" class");
    }
}
