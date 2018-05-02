package nl.andrewlalis.interfaceCommandDemo;

import nl.andrewlalis.interfaceCommandDemo.commands.AgeCommand;
import nl.andrewlalis.interfaceCommandDemo.commands.RenameCommand;
import nl.andrewlalis.interfaceCommandDemo.commands.ToggleOnlineCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        //Create a list of many commands to execute.
        List<Command> commands = new ArrayList<>();

        //Add an instance of each type of command.
        commands.add(new AgeCommand());
        commands.add(new RenameCommand());
        commands.add(new ToggleOnlineCommand());

        //Random object to select commands.
        Random rand = new Random();

        //Create a user to act as the receiver. Commands will execute and perform an action on the receiver.
        User user = new User("A", 25, false);

        //Perform 10 random commands on the user.
        for (int i = 0; i < 10; i++){
            Command commandToExecute = commands.get(rand.nextInt(commands.size()));
            commandToExecute.execute(user);
        }

    }

}
