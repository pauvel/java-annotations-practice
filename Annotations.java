import src.custom.annotations.VeryImportant;
import src.models.Cat;

public class Annotations {
    public static void main(String[] args) {

        // Annotation example:
        // @SuppressWarnings("unused")

        Cat cat = new Cat("Mario");

        // Verify if our class have the custom annotation:
        if(cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Got the annotation");
        }else{
            System.out.println("Doesn't Got the annotation");
        }

    }



}
