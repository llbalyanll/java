package das2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner nup = new Scanner(System.in);
        int First, Second, Result;
        System.out.print("Enter First nup: ");
        First = nup.nextInt();
        System.out.print("Enter Second nup: ");
        Second = nup.nextInt();
        Result = First + Second;
        System.out.println("Result is - " + Result);
    }
}
