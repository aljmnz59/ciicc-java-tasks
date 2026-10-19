package Sheet;

public class OddOrEven {
    static void main() {
        int check_number = 10;
        String message;
        for(int i = 1; i <= check_number; i++){
            message = (i%2==0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);
        }
    }
}
