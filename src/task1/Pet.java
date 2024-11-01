package task1;

import java.util.Arrays;
import java.util.Random;

public class Pet {
    public String species;
    public  String  nickname;
    public  int age;
    public int trickLevel=tricklevelMetod();
    public String[] habits;


    public Pet(String species,String nickname){
        this.species=species;
       this.nickname=nickname;
    }
     public Pet(String species,String nickname,int age,String[]habits){
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
          this.trickLevel=a;
        return  trickLevel;
    }
    public void tostring(){
        System.out.println("dog {nickname="+nickname+", age="+age+", " +
                "tricklevel="+trickLevel+", habits="+ Arrays.toString(habits)+", " +
                "where dog="+species+"}");
    }
}
