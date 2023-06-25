package org.mash;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Hero {

    private String name;
    private int age;
    private String specialPower;
    private String weakness;

    // Constructor
    public Hero(String name, int age, String specialPower, String weakness){
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
    }

    // Getter methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSpecialPower(){
        return specialPower;
    }

    public String getWeakness(){
        return weakness;
    }

    // Setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSpecialPower(String specialPower){
        this.specialPower = specialPower;
    }

    public void setWeakness(String weakness){
        this.weakness = weakness;
    }

    public void displayHeroDetails(){
        System.out.println("Name: "+this.name+
                "\nAge: "+this.age+
                "\nSpecial Power: "+this.specialPower+
                "\nWeakness: "+this.weakness);
    }
}



