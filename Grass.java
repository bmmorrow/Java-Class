package com.brandon.plants;

public abstract class Grass extends Plant {


    //Constructors
    public Grass(){
        this.height = 5;
        this.age = 30;
        this.color = "green";
    }

    public Grass(int height, int age, String color){
        this.height = height;
        this.age = age;
        this.color = color;   
    }

    //Method overloading
    protected void inchesGrown(){
        System.out.println("This plant grows");
    }

    protected void inchesGrown(int inches){
        System.out.println("This plant grows " + inches + " inches");
    }

    private void inchesGrown(Double inchesDouble){
        System.out.println("This plant grows twice this amount: " + inchesDouble);
    }

    //Override from superclass
    @Override
    public void plantGrows(){
        System.out.println("The grass grows");
    }
}
