package src.models;

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
}
