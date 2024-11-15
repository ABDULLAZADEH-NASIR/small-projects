package Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Human mother=new Human("Sevda","Eliyeva",1986);
     Human father=new Human("Cefer","Eliyev",1982);
     Family family=new Family();
     family.setFather(father);
     family.setMother(mother);
     Human child=new Human("Tofiq","Eliyev",2023,66);
     family.setChild(child);
     Human child2=new Human("Osman","Eliyev",2020);
     family.setChild(child2);
     Pet dog=new Pet("dog","Husky","Rex",2);
     family.setPet(dog);
     Human child3=new Human("Sabir","Eliyev",2018);
     family.setChild(child3);
        Human child4=new Human("Samir","Eliyev",2016,66);
        family.addChild(child4);
        System.out.println(family.toString());
        family.deleteChild(child4);
        Human child5=new Human("Hesen","Eliyev",20017,80);
        family.addChild(child5);
        System.out.println(family.toString());
        
    }
}
