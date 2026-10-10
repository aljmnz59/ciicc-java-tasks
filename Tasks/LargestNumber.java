import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
    static void main(String[] args) {
        //Task 5
        List<Integer> num = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Enter a number: ");
            num.add(sc.nextInt());
        }
        int one = num.get(0);
        int two = num.get(1);
        int three = num.get(2);
        if(one >= two && one >= three)
            System.out.println("The largest number is " + one);
        else if(two >= one && two >= three)
            System.out.println("The largest number is " + two);
        else if(three >= one && three >= two)
            System.out.println("The largest number is " + three);
        else System.out.println("All numbers are equal");

        sc.close();
    }
}
