package Task3;

import java.util.Arrays;
import java.util.Objects;

public class Family extends Human {

    static {
        System.out.println("Class Family");
    }


    {
        System.out.println("Object type Family");

    }

  private  Human mother;
  private Human father;
  private Human [] children=new Human[2];
  private Pet pet;
  private static int countFamily=0;
  private int index;




  public  Family(){

  }
    public  Family(Human father,Human mother){
        this.father=father;
        this.mother=mother;
        countFamily+=2;

    }

    public Human getMother() {
      return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
        countFamily++;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
        countFamily++;
    }

    public Human[] getChild() {
        return children;
    }

    public void setChild(Human[] child) {
        this.children = child;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        countFamily++;
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

    public  boolean deleteChild(Human child){
        boolean deleted=false;

          for (int i=0;i<children.length;i++){

              if(children[i]==child){
                  child=null;
                  index=i;
                  countFamily--;
                  deleted=true;
                  break;
              }

          }
            Human [] c=new  Human[children.length-1];

          for (int i=0;i<children.length;i++){
              if(i<index){
                  c[i]=children[i];
              }
              else {
                  c[i]=children[i+1];
              }
          }

          children=c;

          return deleted;
    }

    public  void addChild(Human child){
        boolean isEmpty=false;
        countFamily++;
        for(Human c: children){
            if(c==null){
                c=child;
                System.out.println("The child was added to the family");
                break;
            }
            else {
                isEmpty=true;
            }
        }

        Human [] c=new  Human[children.length+1];

        for(int i=0;i<c.length;i++){
            if(i<children.length){
                c[i]=children[i];
            }
            else {
                c[children.length]=child;
                System.out.println("The child was added to the family");
                children=c;
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if( !(o instanceof Family)){
            return  false;
        }

        Family f=(Family) o;
        if (this.father.equals(f.getFather())&& this.mother.equals(f.getMother()) && this.children==f.children){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName() +" "+mother.getSurname()+", father="+ father.getName()+" "+father.getSurname()+
                ", Children="+ Arrays.toString(children)+", pet="+pet.getNickname() +"}";
}}
