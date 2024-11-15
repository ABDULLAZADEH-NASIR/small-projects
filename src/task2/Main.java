package task2;

public class Main {
    public static void main(String[] args) {

        Human father=new Human();
        father.setName("Vito");
        father.setSurname("Karleone");
        father.setDateYear(1945);

        Human mother=new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");
        mother.setDateYear(1950);

        Pet dog=new Pet();
        dog.setNickname("Rock");
        dog.setAge(5);
        dog.setSpecies("Pitbull");
       String [] habits={"eat","drink","sleep"};
       dog.setHabits(habits);

      Human child=new Human();
       child.setName("Michael");
       child.setSurname("Karleone");
       child.setDateYear(1977);
       child.setIQLevel(90);

       child.setFather(father);
       child.setMother(mother);
       child.setPet(dog);


        System.out.println(dog.tostring());


    }
}