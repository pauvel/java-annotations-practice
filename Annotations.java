import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import src.custom.annotations.RunImmediately;
import src.custom.annotations.VeryImportant;
import src.models.Cat;

public class Annotations {
    public static void main(String[] args) {

        // Annotation example:
        // @SuppressWarnings("unused")

        Cat cat = new Cat("Mario");

        // Verify if our class have the custom annotation:
        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Got the annotation [VeryImportant]");
        }else{
            System.out.println("Doesn't Got the annotation [VeryImportant]");
        }



        // verify if some method has run immediately annotation

        for(Method method : cat.getClass().getMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                try {
                    System.out.println("Invoking: " + method.getName());
                    method.invoke(cat, (Object[])args);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }


    }



}
