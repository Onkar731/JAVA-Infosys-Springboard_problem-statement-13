import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int age = sc.nextInt();

        // checking age is eligible or not
        if(Age.isEligibleAge(age)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Non-Eligible");
        }

        // closing resource
        sc.close();
    }
}
