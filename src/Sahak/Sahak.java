package Sahak;

import java.util.Scanner;
import java.util.Timer;

public class Sahak {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number - ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number - ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third Number - ");
        int thirdNumber = scanner.nextInt();

        System.out.print("Enter forth Number - ");
        int forthNumber = scanner.nextInt();


        if (!(firstNumber == secondNumber) && !(forthNumber < thirdNumber)) {
            System.out.println("1");
        } else if ((firstNumber != secondNumber) || (forthNumber < thirdNumber)) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }*/

        int a = 20;
        int b = 98;
        int c = 0;
        System.out.println(a);//20
        System.out.println(b);//98
        c=a;
        System.out.println(a); // 20
        System.out.println(b); // 98
        a=b;
        System.out.println(a);// 98
        System.out.println(b);// 98
        b=c;
        System.out.println(a);// 98
        System.out.println(b);// 20

    }
}