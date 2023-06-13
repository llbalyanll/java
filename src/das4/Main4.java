package das4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner kov = new Scanner(System.in);
        int simple;
        System.out.println("Enter Simple kov: ");
        simple = kov.nextInt();
        System.out.println("Enter Second Value: ");
        int second = kov.nextInt();

        if (simple >= second) {
            System.out.println("kov is 10");
            System.out.println("k/n");
            System.out.println("kov is lower than " + second);
        } else {
            System.out.println("kov is lower than" + second);
        }

    }
}