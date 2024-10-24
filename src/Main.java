public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        Human mother=new Human("Jane","Karleone",1940);
        Human father=new Human("Vito","Karleone",1937);
        Human child =new Human("Michael","Karleone",1977,95,father, mother);



        String [] habits={"eat","drink","sleep"};

        Pet dog=new Pet("Pitbull","Rock",5,habits);
        child.pet=dog;
        System.out.println(dog.trickLevel);





















    }
}