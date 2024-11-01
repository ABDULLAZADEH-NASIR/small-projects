package task2;
import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int dateYear;
    private Pet pet;
    private int IQLevel;
    private Human mother;
    private Human father;
    private String[][] schedule={};



    public String getName() {
        return name;
    }

    public  void setName(String name) {
        String  regex="[a-zA-Z]";
        StringBuilder result=new StringBuilder();

        for(char c: name.toCharArray()){
            if(String.valueOf(c).matches(regex)){
                result.append(c);
            }
        }
           this.name= String.valueOf(result);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String  regex="[a-zA-Z]";
        StringBuilder result=new StringBuilder();

        for(char c: surname.toCharArray()){
            if(String.valueOf(c).matches(regex)){
                result.append(c);
            }
        }
        this.surname= String.valueOf(result);
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }


    public int getIQLevel() {
        return IQLevel;
    }

    public void setIQLevel(int IQLevel) {
        this.IQLevel = IQLevel;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

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
    public  void greetPet() {
        System.out.println("Hello, " +pet.getNickname());
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
        return "Human {name="+getName()+", Surname="+getSurname()+", " +
                "year="+getDateYear()+", iq= "+getIQLevel()+", " +
                "mother="+mother.getName()+" "+mother.getSurname()+", father= "+father.getName()+" "+father.getSurname()+", " +
                "pet="+pet.getSpecies()+" {nickname="+pet.getNickname()+", " +
                "age="+pet.getAge()+", trciklevel="+pet.getTrickLevel()+", " +
                "habits="+ Arrays.toString(pet.getHabits())+"}";
    }



}