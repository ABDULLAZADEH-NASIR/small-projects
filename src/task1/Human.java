package task1;

import task2.Pet;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int dateYear;
    public Pet pet;
    public int IQLevel;
    public Human mother;
    public Human father;
    public String[][] schedule={};


    public Human(String name, String surname, int dateYear){
      this.name=name;
      this.surname=surname;
      this.dateYear=dateYear;
    }
    public Human(String name, String surname, int dateYear, int IQLevel, Human father, Human mother){
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
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel()>50) {
            System.out.println("I have " + pet.getSpecies() + ",he is " + pet.getAge() + " years old, he is very sly");
        } else {
            System.out.println("I have " + pet.getSpecies() + ",he is " + pet.getAge() + " years old, almost not sly");
        }
    }

    @Override
    public String toString() {
        return "Human {name="+name+", Surname="+surname+", " +
                "year="+dateYear+", iq= "+IQLevel+", " +
                "mother="+mother.name+" "+father.surname+", father="+father.name+" "+father.surname+", " +
                "pet="+pet.getSpecies()+" {nickname="+pet.getNickname()+", " +
                "age="+pet.getAge()+", trciklevel="+pet.getTrickLevel()+", " +
                "habits="+ Arrays.toString(pet.getHabits())+"}";
    }



}