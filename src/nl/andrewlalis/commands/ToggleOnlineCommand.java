package nl.andrewlalis.commands;

import nl.andrewlalis.Command;
import nl.andrewlalis.User;

public class ToggleOnlineCommand implements Command {

    @Override
    public void execute(User user) {
        user.setOnline(!user.isOnline());
        System.out.println("User is now " + (user.isOnline() ? "online." : "offline."));
    }
}
