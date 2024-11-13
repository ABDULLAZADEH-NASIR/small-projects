package Task3;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class Human {

    static {
        System.out.println("Class Human");
    }

    {
        System.out.println("Object type Human");
    }

    private String name;
    private String surname;
    private int dateYear;
    private int IQLevel;
    private String[][] schedule={};


    public String getName() {
        return name;
    }

    public  void setName(String name) {

        boolean suitable=Pattern.compile("^[a-zA-Z]+$").matcher(name).matches();
        if(suitable){
            this.name=name;
        }
        else {
            System.out.println("Invalid name ");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        boolean suitable=Pattern.compile("^[a=zA-Z]+$").matcher(surname).matches();

        if(suitable){
            this.surname=surname;
        }
        else {
            System.out.println("Invalid username ");
        }
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
    public Human(String name, String surname, int dateYear, int IQLevel){
        this.name=name;
        this.surname=surname;
        this.dateYear=dateYear;
        this.IQLevel=IQLevel;
    }
    public Human(){

    }


    @Override
    public boolean equals(Object o) {
        if( !(o instanceof Human)){
            return  false;
        }

        Human h=(Human) o;
        if (this.name.equals(h.getName()) && this.surname.equals(h.getSurname()) && this.dateYear==h.getDateYear()){
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dateYear, IQLevel);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return "Human {name="+getName()+", Surname="+getSurname()+", " +
                "year="+getDateYear()+", iq= "+getIQLevel();
    }




}