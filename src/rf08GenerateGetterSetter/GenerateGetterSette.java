/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf08GenerateGetterSetter;

import java.lang.reflect.Field;
import java.util.Arrays;
import rf08GenerateGetterSetter.model.Person;

/**
 *
 * @author Zakaria Ahmmed
 */
public class GenerateGetterSette {
    	public static void main(String[] args) {
            Class cls = Person.class;
            // Getting fields of the class Person
            System.out.println("---------------Getting fields of the class Person--------------------");
            Field[] fields = cls.getDeclaredFields();
            System.out.println("Fields: " + Arrays.toString(fields));
            StringBuffer sb = new StringBuffer();
            System.out.println("---------All Fields and crossponding Setter and Getter methods--------------");
            for (Field field : fields) {
                String fieldName = field.getName();
                String fieldType = field.getType().getSimpleName();
                
                System.out.println("Field Name: " + fieldName);
                System.out.println("Field Type: " + fieldType);
                
                Generator.createSetter(fieldName, fieldType, sb);
                
                Generator.createGetter(fieldName, fieldType, sb);
            }
            System.out.println(sb.toString());
 
	}
}
