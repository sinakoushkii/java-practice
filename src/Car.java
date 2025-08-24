//    Object -> is an entity that holds data (attributes)
//    and can perform actions (methods)
//    its a reference data type

//    Constructor -> A special method to initialize objects
//    you can pass arguments to a constructor and set up initial values

public class Car {

    String name = "mustang";
    String company = "Ford";
    int model = 2025;
    double price = 58000.32;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("you start the car");
    }

    void stop() {
        isRunning = false;
        System.out.println("you stop the car");
    }

    void drive() {
        System.out.println("you drive the " + name + " made by the " + company);
    }

}
