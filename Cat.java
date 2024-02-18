package com.brandon.animals;
import com.brandon.interfaces.InterfaceOmega;

public class Cat extends Animal implements InterfaceOmega {

    String sound;
    String color;
    int speed;


    // Constructors
    public Cat(){
        this.sound = "meow";
        this.color = "orange and white";
        this.speed = 30;
    }

    public Cat(String sound, String color, int speed){
        this.sound = sound;
        this.color = color;
        this.speed = speed;
    }

    void animalColor() {
        System.out.print("This animal is " + color);
    }

    //Method Overloading
    protected void scratchCouch() {
        System.out.println("This animal scratches the couch");
    }

    protected void scratchCouch(int numOfScratches){
        System.out.println("The cat scratches the couch " + numOfScratches + " times.");
    }

    private void scratchAnimal(String animalScratched){
        System.out.println("The cat scratches the " + animalScratched);
    }

    @Override
    public void flee() {
        System.out.print("The cat runs away");
    }

    //Override from superclass
    @Override
    public void isAnimal(){
        System.out.println("Meow! Meow!");
    }

}
