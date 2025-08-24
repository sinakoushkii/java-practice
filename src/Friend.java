//static = belongs to the class, not objects.
//Shared across all instances.
//Used for utility methods, constants, and entry points (main).

public class Friend {
    static int numberOfFriends=0;
    String name;

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void showNumberOfFriends(){
        System.out.println("The log is from static method of the Friend class");
        System.out.println(numberOfFriends);
    }
}
