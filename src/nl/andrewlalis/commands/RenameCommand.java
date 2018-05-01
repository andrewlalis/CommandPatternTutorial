package nl.andrewlalis.commands;

import nl.andrewlalis.Command;
import nl.andrewlalis.User;

public class RenameCommand implements Command {

    @Override
    public void execute(User user) {
        user.setName(user.getName()+user.getName());
        System.out.println("Changed name to: " + user.getName());
    }
}
