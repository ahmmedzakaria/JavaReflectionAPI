/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf09CallAllGetterSetterMethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import rf09CallAllGetterMethods.model.Product;

/**
 *
 * @author Zakaria Ahmmed
 */
public class CallAllGetterSetterMethods {
    public static void main(String[] args) {
        //Class cls = Product.class;
        Object obj =invokeAllSetters(Product.class);
        invokeAllGetters(obj);    
    }
    
    
    
    public static void invokeAllGetters(Object obj){
        Class cls = obj.getClass();
        System.out.println("===================invokeAllGetters=========================");
        List<Method> methodList = Arrays.asList(cls.getDeclaredMethods());
        methodList.forEach(method->{
            String match =  method.getName().substring(0, 3);
            if(match.equals("get")){
                try {
                    System.out.println(method.invoke(obj));
                } catch (IllegalAccessException | IllegalArgumentException |InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
       public static Object invokeAllSetters(Class cls){
           System.out.println("======================invokeAllSetters==========================");
        List<Method> methodList = Arrays.asList(cls.getDeclaredMethods());
        Product obj= new Product();
        Product obj2= null;
        for(Method method : methodList){
            String methodName = method.getName();
            String match =  methodName.substring(0, 3);
            if(match.equals("set")){
                try {
                    obj2 = (Product) cls.newInstance();
                    System.out.println(obj);
                    method.invoke(obj,methodName.substring(3, methodName.length()));
                } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            Product p =(Product)obj;
           // System.out.println(p.getProductId());
        }
        
        return obj;
    }
}
