import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int myAge=27;
        double price=17.5;
        char symbol= '$';
        boolean isStudent=true;
        boolean isActive=false;


        String userName="sina koushki";

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your information: ");
        String userInfo =scanner.nextLine();

        System.out.print("Whats your gpa : ");
        double userGpa=scanner.nextDouble();

        System.out.print("Are you a teacher : ");
        boolean isTeacher= scanner.nextBoolean();

        scanner.close();

        System.out.println("user info : "+userInfo+userAge+userGpa+isTeacher);






    }
}
