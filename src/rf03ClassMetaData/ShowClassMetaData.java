/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf03ClassMetaData;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import rf03ClassMetaData.model.Child;
import rf03ClassMetaData.model.Parent;
import util.Util;

/**
 *
 * @author Zakaria Ahmmed
 */
public class ShowClassMetaData {
    public static void main(String[] args) {
        ShowClassMetaData metaData = new ShowClassMetaData();
        Class cls = Parent.class;
        Class cls2 = Child.class;
        //metaData.displayMataData(cls);
        metaData.displayMataData(cls2);
    }
    
    void displayMataData(Class cls){
        Util.print(cls.getName(), "Class Full Qualified Name");
        Util.print(cls.getSimpleName(), "Class Simple Name");
        Util.print(cls.getSuperclass(), "Super Class Name");
        Util.print(Arrays.asList(cls.getInterfaces()),
                "Implemented Interfaceses of class "+cls.getSimpleName());       
        Util.print(Modifier.toString(cls.getModifiers()),
                "Modifiers of class "+cls.getSimpleName());
        
        Util.print(Arrays.asList(cls.getMethods()),
                "All Public Method of "+cls.getSimpleName()+" class and its super class");        
        Util.print(Arrays.asList(cls.getDeclaredMethods()),
                "All Method of "+cls.getSimpleName()+" class");
        
         Util.print(Arrays.asList(cls.getFields()),
                "All Public Field of "+cls.getSimpleName()+" class and its super class");       
        Util.print(Arrays.asList(cls.getDeclaredFields()),
                "All Field of "+cls.getSimpleName()+" class");
        
         Util.print(Arrays.asList(cls.getConstructors()),
                "All Public Constructor of "+cls.getSimpleName()+" class");       
        Util.print(Arrays.asList(cls.getDeclaredConstructors()),
                "All Constructor of "+cls.getSimpleName()+" class");
               
        Util.print(Arrays.asList(cls.getMethods()),
                "All Public Method of "+cls.getSimpleName()+" class and its super class");       
        Util.print(Arrays.asList(cls.getDeclaredMethods()),
                "All Method of "+cls.getSimpleName()+" class");
               
        Util.print(Arrays.asList(cls.getAnnotations()),
                "All Public Annotation of "+cls.getSimpleName()+" class and its super class");       
        Util.print(Arrays.asList(cls.getDeclaredAnnotations()),
                "All Annotation of "+cls.getSimpleName()+" class");
        
    }
    
    
 
}
