package com.brandon.plants;

public abstract class Tree extends Plant {
    
    //Constructors
    public Tree(){
        this.height = 1;
        this.age = 50;
        this.color = "black and white";
    }

    public Tree(int height, int age, String color){
        this.height = height;
        this.age = age;
        this.color = color;
    }

    //Method overloading
    protected void treeColor(){
        System.out.println("This tree has color");
    }

    protected void treeColor(String colorString){
        System.out.println("This tree's color is " + colorString);
    }

    private void treeColor(Double colorDouble){
        System.out.println("The tree's color is " + colorDouble);
    }

    //Override from superclass
    @Override
    public void plantGrows(){
        System.out.println("The tree grows");
    }

}
