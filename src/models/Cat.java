package src.models;

import src.custom.annotations.RunImmediately;
import src.custom.annotations.VeryImportant;

@VeryImportant
public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    @RunImmediately(times = 3)
    public void getCatStatus(){
        System.out.println("CAT US HUNGRY!");
    }
}
