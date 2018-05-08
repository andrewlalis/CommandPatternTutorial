package nl.andrewlalis.interfaceCommandDemo;

import nl.andrewlalis.interfaceCommandDemo.commands.AgeCommand;
import nl.andrewlalis.interfaceCommandDemo.commands.RenameCommand;
import nl.andrewlalis.interfaceCommandDemo.commands.ToggleOnlineCommand;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        //Create a list of many commands to execute.
        Map<String, Command> commands = new HashMap<>();

        //Add an instance of each type of command.
        commands.put("incrementAge", new AgeCommand());
        commands.put("rename", new AgeCommand());
        commands.put("toggleOnline", new AgeCommand());

        //Random object to select commands.
        Random rand = new Random();

        //Create a user to act as the receiver. Commands will execute and perform an action on the receiver.
        User user = new User("A", 25, false);

        Scanner input = new Scanner(System.in);
        String line;

        while (!line.equals("exit")){
            line = input.nextLine().toLowerCase();
            if (!commands.containsKey(line)){
                System.err.println("Unknown command.");
            } else {
                commands.get(line).execute(user);
            }
        }

    }

}
