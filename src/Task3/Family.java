package Task3;

import java.util.Arrays;
import java.util.Objects;

public class Family  {

    static {
        System.out.println("Class Family");
    }

    {
        System.out.println("Object type Family");
    }

    private Human human;
  private  Human mother;
  private Human father;
  private Human [] children=new Human[10];
  private Pet pet;
  private static int countFamily=0;
  private static  int point;
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

    public String getChild(Human child) {
        return String.format("name=%s, surname=%s, data year=%d",child.getName(),
                child.getSurname(),child.getDateYear());

        }

    public void setChild(Human child) {
      addChild(child);
        countFamily++;
    }

    public String getPet(Pet pet) {
        return String.format("nickname=%s, species=%s, age=%d",pet.getNickname(),
                pet.getSpecies(),pet.getAge());
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

          for(int i=0;i<children.length;i++){
              if(children[i].equals(child)&& children[i]!=null){
                  children[i]=null;
                  countFamily--;
                  deleted=true;
                  System.out.println("Child is deleted");
                  index=i;
                  break;
              }
          }
          for(int i=0;i<children.length;i++){
              if( i==index &&index!= children.length-1){
                children[i]=children[i+1];
                children[i+1]=null;
              }
          }
          return deleted;
    }

    public  void addChild(Human child){
        boolean isEmpty=false;
        countFamily++;
            if(point<children.length){
                children[point]=child;
                point++;
                System.out.println("The child was added to the family");
            }
            else {
                isEmpty=true;
            }

        if(isEmpty) {
            children=Arrays.copyOf(children,children.length*2);
            children[point]=child;
            point++;
            System.out.println("The child was added to the family");
        }
    }
    public String seeChildren(){
      StringBuilder stringBuilder=new StringBuilder("");
          for(Human h:children){
              if(h!=null){
                  stringBuilder.append(h.getName() + " ");
              }
          }
       return String.valueOf(stringBuilder);
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
                ", Children="+seeChildren()+", pet="+pet.getNickname() +"}";
}}
