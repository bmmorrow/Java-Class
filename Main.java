package com.brandon;

import com.brandon.animals.Animal;
import com.brandon.animals.Cat;
import com.brandon.animals.Dog;
import com.brandon.animals.GuineaPig;
import com.brandon.animals.Horse;
import com.brandon.plants.Plant;
import com.brandon.plants.Bush;
import com.brandon.plants.Grass;
import com.brandon.plants.Tree;

public class Main {

// DONE Write a sample java project with at least 10 classes (including at least two abstract classes) and 2 interfaces and 4 packages.
// DONE Each class must have at least two constructors.
// DONE Each class must have method overloading other than constructors.
// DONE Each class must have public, private, protected members.
// DONE Each subclass must have overriding of at least one method from its super class
// DONE Use the following keywords at least five times each: public, private, protected, static, abstract, implements, extends, final
// Visualize the class diagram using Mermaid or other tools you prefer.
// Submit your GitHub repo URL with code and a PNG image file of your class diagram.

int animalAge;
int plantAge;
String animalSound;
String plantSound;
String animalColor;
String message;

//Constructors
public Main(int animalAge, String animalSound, String animalColor){
    this.animalAge = animalAge;
    this.animalSound = animalSound;
    this.animalColor = animalSound;
}

public Main(){
    this.message = "This is a main function";
}

protected Main(int plantAge, String plantSound){
    this.plantAge = plantAge;
    this.plantSound = plantSound;
}

//Method overloading
public void animalsOrPlants(){
    System.out.println("I like animals and plants");
}

public void animalsOrPlants(String animalOrPlant){
    System.out.println("I like " + animalOrPlant);
}

private void animalsOrPlants(Double animalOrPlant){
    System.out.println("I LOVE " + animalOrPlant);
}
    
public static void main(String[] args) throws Exception {

    Main myMain = new Main();
    String value = "animals!";
    myMain.animalsOrPlants(value);
    
    GuineaPig guineapig = new GuineaPig("weet weet");
    Horse horse = new Horse("neigh");

    System.out.println();
    guineapig.isAnimal();
    System.out.println("The guineapig can run at " + guineapig.speed + "mph");

    horse.fight();

    }
}
