package it.project.classes;

public class Person {
    private int age;

    public Person(){
        double max = 80.0, min = 5.0;
        this.age =(int)Math.floor(Math.random() * (max-min-1) + min);
        System.out.println(this.age);
    }

    public String getLifeStage(){
        if(this.age <= 12)
            return "Child";
        else if(this.age > 13 && this.age <= 19)
            return "Teen";
        else if(this.age > 20 && this.age <= 59 )
            return "Adult";
        else if(this.age > 59)
            return "Senior Adult";
        else
            return "error";  //added this because java needed a default return statement
                             //(if u comment the last else u get error)
    }
}
