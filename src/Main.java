import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    mathCalculation();
        showCircumferenceAndArea();
    }

    public static void mathCalculation() {
        double result;
        double roundedPI = Math.round(Math.PI * 100.0) / 100.0;
        result = Math.pow(2, 3);
//        absolute value
        result = Math.abs(-6);
//        square root of a number
        result = Math.sqrt(9);
//        round up ^
        result = Math.ceil(3.14);
//        round down
        result = Math.floor(3.99);
        result = Math.min(10, 20);
        result = Math.max(10, 20);

//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        double poweredNumbers = Math.pow(number1, 2) + Math.pow(number2, 2);
        System.out.println("The result is: " + Math.sqrt(poweredNumbers));

        scanner.close();

    }

    public static void showCircumferenceAndArea() {
//        circumference=2*Math.PI*radius
//        area= Math.PI*Math.pow(radius,2)
//        volume=(4.0/3.0) * Math.PI * Math.pow(radius,3)

        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.print("Enter a number: ");
        radius = scanner.nextDouble();

        double circumference = 2 * radius * Math.PI;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        scanner.close();

        System.out.println("");
        System.out.printf("circumference is: %.1f\n", circumference);
        System.out.printf("area is: %.1f\n", area);
        System.out.printf("volume is: %.1f\n", volume);
    }


    public static void logCommand() {
        int myAge = 27;
        double price = 17.5;
        char symbol = '$';
        boolean isStudent = true;
        boolean isActive = false;


        String userName = "sina koushki";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your information: ");
        String userInfo = scanner.nextLine();

        System.out.print("Whats your gpa : ");
        double userGpa = scanner.nextDouble();

        System.out.print("Are you a teacher : ");
        boolean isTeacher = scanner.nextBoolean();

        scanner.close();

        System.out.println("user info : " + userInfo + userAge + userGpa + isTeacher);

    }
}
