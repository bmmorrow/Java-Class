package com.brandon.animals;
import com.brandon.interfaces.InterfaceOmega;

public class GuineaPig extends Animal implements InterfaceOmega{

    String sound;
    public int speed;
    String color;


    //Constructors
    public GuineaPig(){
        this.sound = "weet weet";
        this.color = "black";
        this.speed = 10;
    }

    public GuineaPig(String sound, String color, int speed){
        this.sound = sound;
        this.color = color;
        this.speed = speed;
    }

    public GuineaPig(String sound) {
        this.sound = sound;
    }

    //Method overloading
    protected void isMad(){
        System.out.println("The guineapig is mad at something");
    }

    protected void isMad(String whatAnimal){
        System.out.println("The guineapig is mad at the " + whatAnimal);
    }

    private void isMad(Double whatAnimaDouble){
        System.out.println("The guineapig is mad at the " + whatAnimaDouble);
    }

    
    @Override
    public void flee() {
        System.out.println("The guineapig runs away");
    }

    //Override from superclass
    @Override
    public void isAnimal(){
        System.out.println("weet! weet!");
    }
    

}
