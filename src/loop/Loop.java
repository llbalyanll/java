package loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int firstNumber = scanner.nextInt();

        while (firstNumber == 20) {
            System.out.println("Hello Arsen !");
            System.out.print("Enter First Number - ");
            firstNumber = scanner.nextInt();
        }

        System.out.println("END!");
    }
}
