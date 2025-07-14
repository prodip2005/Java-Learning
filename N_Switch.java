import java.util.Scanner;

public class N_Switch {
    public static void main(String a[]) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of the week: ");
        n = input.nextInt();
        String result=switch (n) {
            case 1 -> "Saturday";
                
            case 2 -> "Sunday";
                
            case 3 -> "Monday";
                
            case 4 -> "Tuesday";
                
            case 5 -> "Wednesday";
                
            case 6 -> "Thursday";
                
            case 7 -> "Friday";
                
            default -> "This is not the number of we";
                
        };
        System.out.println(result);
    }
}
