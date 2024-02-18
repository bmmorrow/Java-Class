package com.brandon.animals;


public abstract class Animal {

    int age;
    String name;
    int speed;
    protected String sound;
    protected String color;

    public static final String ILOVEANIMALS = "I Love!";
    public static final String ANIMALSARETHEBEST = "Animals are the best!";
    public static final String TAKEALOOK = "Take a look at these animals!";

    //Constructors
    public Animal(){
        this.sound = "animal sounds!";
        this.color = "random colors!";
        this.speed = 50;
    }

    public Animal(String sound, String color, int speed){
        this.sound = sound;
        this.color = color;
        this.speed = speed;
    }

    // Method overloading with different parameter types
    protected void makeSound(){
        System.out.println("The animal makes a sound: " + sound);
    }

    protected void makeSound(String location){
        System.out.println("The animal makes a sound at " + location + ": " + sound);
    }

    private void makeSound(Double locationDouble){
        System.out.println("The animal makes a sound at " + locationDouble);
    }

    //Override test method for child classes
    public abstract void isAnimal();
   
}
