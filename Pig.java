package com.brandon.animals;
import com.brandon.interfaces.InterfaceOmega;

public class Pig extends Animal implements InterfaceOmega {

    public String sound;
    public String color;
    public int speed;

    @Override
    public void flee(){
        System.out.print("The pig runs away!");
    }

    //Constructors
    public Pig(){
        this.sound = "oink";
        this.color = "pink";
        this.speed = 10;
    }

    public Pig(String sound, String color, int speed){
        this.sound = sound;
        this.color = color;
        this.speed = speed;
    }

    //Method overloading
    protected void pigOinks(){
        System.out.println("The pig oinks");
    }

    protected void pigOinks(String whichAnimalString){
        System.out.println("The pig oinks at the " + whichAnimalString);
    }

    private void pigOinks(Double whichAnimalDouble){
        System.out.println("The pig oinks at a " + whichAnimalDouble);
    }

    //Override from superclass
    @Override
    public void isAnimal(){
        System.out.println("Oink! Oink!");
    }
}
