package nl.andrewlalis.commands;

import nl.andrewlalis.Command;
import nl.andrewlalis.User;

public class AgeCommand implements Command {

    @Override
    public void execute(User user) {
        user.setAge(user.getAge()+1);
        System.out.println("User's age has increased to " + user.getAge());
    }
}
