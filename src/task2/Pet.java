package task2;
import java.util.Arrays;
import java.util.Random;

public class Pet {
    private String species;
    private String  nickname;
    private int age;
    private int trickLevel=tricklevelMetod();
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        StringBuilder s=new StringBuilder();
        String regex="[a-zA-Z]";

        for(char c:nickname.toCharArray()){
            if(String.valueOf(c).matches(regex)){
                s.append(c);
            }
        }
        this.nickname= String.valueOf(s);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }



    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Pet(String species, String nickname){
        this.species=species;
       this.nickname=nickname;
    }
     public Pet(String species, String nickname, int age, String[]habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.habits=habits;
     }
    public Pet(){

    }
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am "+nickname+". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public int tricklevelMetod(){
        Random random=new Random();
        int a=random.nextInt(1,100);
        return  a;
    }

    public String tostring(){
        return "dog {nickname="+getNickname()+", age="+getAge()+", " +
                "tricklevel="+getTrickLevel()+", habits="+ Arrays.toString(getHabits())+", " +
                "where dog="+getSpecies()+"}";
    }
}
