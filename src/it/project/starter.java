package it.project;

import it.project.classes.Person;

public class starter {
    public static void main(String[] args){
        Person persona1 = new Person();
        System.out.println("The person is in the " + persona1.getLifeStage() + " stage of life.");
    }
}
