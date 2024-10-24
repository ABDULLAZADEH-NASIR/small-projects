import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Human {
    public String name;
    public String surname;
    public int dateYear;
    public Pet pet;
    public int IQLevel;
    public Human mother;
    public Human father;
    public String[][] schedule={};


    public Human(String name,String surname,int dateYear){
      this.name=name;
      this.surname=surname;
      this.dateYear=dateYear;
    }
    public Human(String name,String surname,int dateYear,int IQLevel,Human father,Human mother){
        this.name=name;
        this.surname=surname;
        this.dateYear=dateYear;
        this.IQLevel=IQLevel;
        this.father=father;
        this.mother=mother;
    }
    public Human(){

    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel>50) {
            System.out.println("I have " + pet.species + ",he is " + pet.age + " years old, he is very sly");
        } else {
            System.out.println("I have " + pet.species + ",he is " + pet.age + " years old, almost not sly");
        }
    }

    @Override
    public String toString() {
        return "Human {name="+name+", Surname="+surname+", " +
                "year="+dateYear+", iq= "+IQLevel+", " +
                "mother="+mother.name+" "+father.surname+", father="+father.name+" "+father.surname+", " +
                "pet="+pet.species+" {nickname="+pet.nickname+", " +
                "age="+pet.age+", trciklevel="+pet.trickLevel+", " +
                "habits="+ Arrays.toString(pet.habits)+"}";
    }



}