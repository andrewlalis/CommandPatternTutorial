package nl.andrewlalis.interfaceCommandDemo.commands;

import nl.andrewlalis.interfaceCommandDemo.Command;
import nl.andrewlalis.interfaceCommandDemo.User;

public class ToggleOnlineCommand implements Command {

    @Override
    public void execute(User user) {
        user.setOnline(!user.isOnline());
        System.out.println("User is now " + (user.isOnline() ? "online." : "offline."));
    }
}
