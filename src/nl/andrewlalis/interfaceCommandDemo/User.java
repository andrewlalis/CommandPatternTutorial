package nl.andrewlalis.interfaceCommandDemo;

/**
 * The User class represents some generic object with some instance variables.
 * It acts as the 'receiver' in the command pattern, because the purpose of
 * commands is to modify the receiver.
 */
public class User {

    private String name;
    private int age;
    private boolean online;

    public User(String name, int age, boolean online){
        this.name = name;
        this.age = age;
        this.online = online;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setOnline(boolean newOnline){
        this.online = newOnline;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isOnline(){
        return this.online;
    }

}
