package nl.andrewlalis.interfaceCommandDemo.commands;

import nl.andrewlalis.interfaceCommandDemo.Command;
import nl.andrewlalis.interfaceCommandDemo.User;

public class RenameCommand implements Command {

    @Override
    public void execute(User user) {
        user.setName(user.getName()+user.getName());
        System.out.println("Changed name to: " + user.getName());
    }
}
