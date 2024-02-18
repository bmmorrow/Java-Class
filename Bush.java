package com.brandon.plants;

public abstract class Bush extends Plant{

    //Constructors
    public Bush(){
        this.height = 3;
        this.age = 100;
        this.color = "green";
    }

    public Bush(int height, int age, String color){
        this.height = height;
        this.age = age;
        this.color = color;
    }

    //Method overloading
    protected void plantType(){
        System.out.println("This is a plant");
    }

    protected void plantType(String typeOfPlant){
        System.out.println("This plant is a" + typeOfPlant);
    }

    private void plantType(Double typeOfPlantDouble){
        System.out.println("There are two of the plant " + typeOfPlantDouble);
    }

    //Override from superclass
    @Override
    public void plantGrows(){
        System.out.println("The bush grows");
    }

    public void justForBushes(){
        System.out.println("The bush is the best plant");
    }

}
