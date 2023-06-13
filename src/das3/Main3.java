package das3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner lup = new Scanner(System.in);
        float mek, erku, result;
        System.out.println("Enter mek lup");
        mek = lup.nextFloat();
        System.out.println("Enter erku.lup");
        erku = lup.nextFloat();
        result = mek + erku;
        result /= 2;
        System.out.println("Result is - " + result);
    }
}
