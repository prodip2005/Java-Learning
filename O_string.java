public class O_string {
    public static void main(String[] args) {
        String day="sunday";
        String result;
        result=switch(day)
        {
            case "sunday","saturday" ->  "6pm";
            case "monday" -> "8pm";
            default -> "7am"; 
        };
        System.out.println(result);
    }
}
