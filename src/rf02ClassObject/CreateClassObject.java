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

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
public class CreateClassObject {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalArgumentException, IllegalAccessException, InvocationTargetException, 
            InstantiationException, NoSuchMethodException {
       //1. Method1
        Class class1 = Class.forName("rf02ClassObject.Employee");
         System.out.println("getName: "+class1.getName());
        System.out.println("getSuperclass: "+class1.getSuperclass());
        
        // get interfaces
        Class[] interfaces = class1.getInterfaces();
        System.out.println("interfaces: "+Arrays.asList(interfaces));
        
        //get Class Modifiers
        int modifiersInt = class1.getModifiers();
        String modifiers = Modifier.toString(modifiersInt);
        System.out.println("modifiers: "+modifiers);
        
        
        // get public fields Metadata of a class and super class
        Field [] publicFields = class1.getFields();
        
        // get all fields Metadata of a class but not super class
        Field [] declaredFields = class1.getDeclaredFields();
        printFields(declaredFields, "Field Variables");
        
        // get public Methods Metadata of a class and super class
        Method[] publicMethods = class1.getMethods();
             
        // get all Methods Metadata of a class but not super class
        Method[] declaredMethods = class1.getDeclaredMethods();
        printMethods(declaredMethods, "Method");
        invokeMethodSum(declaredMethods[0], class1);
        invokeMethodDetailInfo(class1);
       // invokeMethodSum(declaredMethods[1]);
        // get public Constructor Metadata of a class and super class
        Constructor[] publicConstructor = class1.getConstructors();
             
        // get all Constructor Metadata of a class but not super class
        Constructor[] declaredConstructor = class1.getDeclaredConstructors();
        printConstructors(declaredConstructor, "Constructor");
        
        //2.Method2
        Employee employee = new Employee();
        Class class2 = employee.getClass();
        
        
        //3.Method3
        Class class3 = Employee.class;
           
    }
    
    public static void printFields(Field [] fields, String msg) throws IllegalArgumentException, IllegalAccessException{
        System.out.println("Printing "+ msg +" info");
        for(Field field : fields){
            System.out.println("---------------------");
            System.out.println("Field>>getName: "+ field.getName());
            System.out.println("Field>>getType: "+ field.getType());
            
            Object value = field.get(field);
            System.out.println("Field>>value: "+ field.get(value));
            
            int modifirInt = field.getModifiers();
            System.out.println("Modifier: "+Modifier.toString(modifirInt));
            System.out.println("---------------------");
        }
    }
    
        public static void printMethods(Method [] methods, String msg) throws IllegalArgumentException, IllegalAccessException{
         System.out.println("Printing "+ msg +" info");
            for(Method method : methods){
            System.out.println("---------------------");
            System.out.println("Method>>getName: "+ method.getName());
            System.out.println("Method>>getReturnType: "+ method.getReturnType());
            
            int modifirInt = method.getModifiers();
            System.out.println("Method Modifier: "+Modifier.toString(modifirInt));
            
            Class[] parameterTypes = method.getParameterTypes();
            System.out.println("Method parameterTypes: "+ Arrays.asList(parameterTypes));
            
            Class[] exceptionTypes = method.getExceptionTypes();
            System.out.println("Method exceptionTypes: "+Arrays.asList(exceptionTypes));
            System.out.println("---------------------");
        }
    }
        
         public static void printConstructors(Constructor [] constructors, String msg) throws IllegalArgumentException, IllegalAccessException{
         System.out.println("Printing "+ msg +" info");
            for(Constructor constructor : constructors){
            System.out.println("---------------------");
            System.out.println("Constructor>>getName: "+ constructor.getName());
            
            int modifirInt = constructor.getModifiers();
            System.out.println("Constructor Modifier: "+Modifier.toString(modifirInt));
            
            Class[] parameterTypes = constructor.getParameterTypes();
            System.out.println("Constructor parameterTypes: "+ Arrays.asList(parameterTypes));
            
            Class[] exceptionTypes = constructor.getExceptionTypes();
            System.out.println("Constructor exceptionTypes: "+Arrays.asList(exceptionTypes));
            System.out.println("---------------------");
        }
    }
         
     public static void invokeMethodSum(Method method, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
     //    Method sumInstanceMethod
    //  = Operations.class.getMethod("publicSum", int.class, double.class);
 
    Employee employee = new Employee();
    Double result
      = (Double) method.invoke(cls.newInstance(), 1, 3);
         System.out.println("invoke Done> Method Name: "+method.getName());
         System.out.println("---------------------");
     }
             
      public static void invokeMethodDetailInfo( Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException{
        Method method = Employee.class.getMethod("detailInfo");
     
 
    Employee employee = new Employee();
    String result
      = (String) method.invoke(cls.newInstance());
         System.out.println("invoke Done> Method Name: "+method.getName()+" >>Result: "+result);
         System.out.println("---------------------");
     }
}
