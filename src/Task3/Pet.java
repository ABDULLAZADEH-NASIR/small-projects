package Task3;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Pattern;

public  class Pet {
    static {
        System.out.println("Class Pet");
    }

    {
        System.out.println("Object type Pet");
    }

    private String animal;
    private String species;
    private String  nickname;
    private int age;
    private int trickLevel=tricklevelMetod();
    private String habits;


    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

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
       boolean suitable= Pattern.compile("^[a-zA-Z]+$").matcher(nickname).matches();
        if (suitable) {
            this.nickname=nickname;
        }
        else {
            System.out.println("Invalid nickname ");
        }
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





    public Pet(String animal,String species, String nickname){
        this.species=species;
       this.nickname=nickname;
       this.animal=animal;
    }
     public Pet(String animal,String species, String nickname, int age){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.animal=animal;
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


    @Override
    public boolean equals(Object o) {
       if( !(o instanceof Pet)){
           return  false;
       }

       Pet pet=(Pet) o;
       if (this.nickname.equals(pet.nickname) && this.age==pet.getAge() &&
               this.species.equals(pet.getSpecies())&& this.animal.equals(pet.getAnimal())){
           return true;
       }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        return result;
    }

    public String petHabits(){

       if(animal.equalsIgnoreCase("dog")){
         return "The dog barks";
       } else if (animal.equalsIgnoreCase("cat")) {
         return   "The cat runs away";
       } else if (animal.equalsIgnoreCase("fish")) {
           return "The fish swims";
       }else {
           return null;
       }
    }

    public String tostring(){
        return "dog {nickname="+getNickname()+", age="+getAge()+", " +
                "tricklevel="+getTrickLevel()+", habits="+ petHabits()+", " +
                "where dog="+getSpecies()+"}";
    }
}
