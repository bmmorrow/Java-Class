package com.brandon.animals;
import com.brandon.interfaces.InterfaceAlpha;

public class Horse extends Animal implements InterfaceAlpha{

    String sound;
    double speed = 55;


    //Constructors
    public Horse(String sound){
        this.sound = sound;
        System.out.println("Horses run at " + speed + "mph");
        System.out.println("The horse goes " + sound);
    }

    public Horse(){
        this.sound = "neigh";
        this.color = "brown and white";
        this.speed = 60;
    }

    //Method overloading
    protected void horseWhinny(){
        System.out.println("The horse whinnies");
    }

    protected void horseWhinny(String whatAnimalString){
        System.out.println("The horse whinnies at the " + whatAnimalString);
    }
    private void horseWhinny(Double whatAnimalDouble){
        System.out.println("The horse whinnies at " + whatAnimalDouble);
    }

    @Override
    public void fight() {
        System.out.println("The horse stands its ground");
    }

    //Override from superclass
    @Override
    public void isAnimal(){
        System.out.println("neigh! neigh!");
    }

}
