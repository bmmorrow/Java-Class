package com.brandon.animals;
import com.brandon.interfaces.InterfaceAlpha;

public class Dog extends Animal implements InterfaceAlpha{
    
    String sound = "bark";
    int speed = 40;


    //Constructors
    public Dog(){
        this.sound = "bark";
        this.color = "black and white";
        this.speed = 40;
    }

    public Dog(String sound, String color, int speed){
        this.sound = sound;
        this.color = color;
        this.speed = speed;
    }

    //Method Overloading
    protected void bark(){
        System.out.println("The dog barks at something");
    }

    protected void bark(String whatAnimal){
        System.out.println("The dog is barking at a " + whatAnimal);
    }

    private void bark(Double whatAnimalDouble){
        System.out.println("The dog is barking at a " + whatAnimalDouble);
    }

    @Override
    public void fight() {
        System.out.println("The dog stands its ground");
    }
    
    //Override from superclass
    @Override
    public void isAnimal(){
        System.out.println("Woof! Woof!");
    }

}
