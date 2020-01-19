/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Util {
       public static void print(Object obj, String massage){
        System.out.println("-------------------------------------------------");
        System.out.println("*********"+ massage + "**********");
        
        System.out.println(obj);
        
        System.out.println("-------------------------------------------------\n"); 
    }
       
      public static void print(List<Object> objList, String massage){
        System.out.println("-------------------------------------------------");
        System.out.println("*********"+ massage + "**********");
        objList.forEach(System.out::println);
        
        System.out.println("-------------------------------------------------\n"); 
    }
}
