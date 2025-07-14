import java.util.Scanner; //this is essential for take user input

public class F_UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // we can write anything on replace input. we can take any name

        System.out.print("Enter The number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Enter Your Name: ");
        String name = input.next();
        input.nextLine();
        System.out.print("Enter Your full Name: ");
        String name2 = input.nextLine();

        System.out.print("Enter Your Age in Double: ");
        Double age = input.nextDouble();

        System.out.println("Number= " + number);
        System.out.println("Name= " + name);
        System.out.println("Full Name= " + name2);
        System.out.println("Age= " + age);
    }
}
