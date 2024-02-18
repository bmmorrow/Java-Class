package com.brandon.plants;

public abstract class Plant{
    int age;
    int height;
    String color;

    public static final String ILOVEPLANTS = "I love plants so much";
    public static final String TAKEALOOKPLANTS = "Take a look at my favorite plants";

    //Constructors
    public Plant(){
        this.age = 50;
        this.height = 100;
        this.color = "green";
    }

    public Plant(int age, int height, String color){
        this.age = age;
        this.height = height;
        this.color = color;
    }

    //Method overloading
    protected void isPlant(){
        System.out.println("This is a plant");
    }

    protected void isPlant(String typeOfPlant){
        System.out.println("This type of plant is " + typeOfPlant);
    }

    private void isPlant(Double typeOfPlantDouble){
        System.out.println("This plant is a " + typeOfPlantDouble);
    }

    //Override test method for child classes
    public abstract void plantGrows();
    public abstract void justForBushes();
}
