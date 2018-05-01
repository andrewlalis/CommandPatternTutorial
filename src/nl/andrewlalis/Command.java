package nl.andrewlalis;

public interface Command {

    //Execute some action, with a user object that acts as the receiver.
    void execute(User user);

}
