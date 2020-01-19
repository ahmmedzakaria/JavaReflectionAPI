/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf06CreateInstanceUsingConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rf06CreateInstanceUsingConstructor.model.Student;

/**
 *
 * @author Zakaria Ahmmed
 */
public class CreateInstanceUsingConstructor {
    public static void main(String[] args) throws Exception{
        Class cls = Student.class;
        List<Constructor> constructorList =Arrays.asList(cls.getDeclaredConstructors());
        constructorList.forEach(constructor->{
            Student student = null;
            System.out.println(constructor.getName());
            if(Modifier.toString(constructor.getModifiers()).equals("private")){
                constructor.setAccessible(true);
                try {
                    student = (Student) constructor.newInstance();
                } catch (InstantiationException | IllegalAccessException| IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }else{
                 try {
                    student = (Student) constructor.newInstance(235,"Abdur Rohim");
                } catch (InstantiationException | IllegalAccessException| IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            student.printDetail();
        });
    }
}
