import javax.sound.midi.SysexMessage;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        byte num = 33;
        System.out.println(num);
        System.out.println("byte\t1 byte\tStores whole numbers from -128 to 127");

        int nur = 25666;
                System.out.println(nur);
                System.out.println("int\t4 bytes\tStores whole numbers from -2,147,483,648 to 2,147,483,647");

                Float nuk = 23.45f;
                System.out.println(nuk);
                System.out.println("4 bytes\tStores fractional numbers. Sufficient for storing 6 to 7 decimal digits");

                double nud = 25.5641246d;
                System.out.println(nud);
                System.out.println("8 bytes\tStores fractional numbers. Sufficient for storing 15 decimal digits");

                boolean isTrue = true;
                System.out.println(isTrue);
                boolean isFalse = false;
                System.out.println(isFalse);
                System.out.println("boolean\t1 bit\tStores true or false values");

                char sim = 'A';
                System.out.println(sim);
                System.out.println("char\t2 bytes\tStores a single character/letter or ASCII values");

                String str = "Hello world";
                System.out.println(str);

                Scanner sso = new Scanner(System.in);
                System.out.println(sso.nextLine());


                Scanner nup = new Scanner(System.in);
                int First,Second,Result;
                System.out.println("Enter First nup:");
                First = nup.nextInt();
                System.out.println("Enter Second nup:");
                Second = nup.nextInt();
                Result = First + Second;
                System.out.println("Result is -" + Result);
                Scanner lup = new Scanner(System.in);

                Float mek,erku,result;
                System.out.println("Enter mek lup");
                mek = lup.nextFloat();
                System.out.println("Enter erku.lup");
                erku = lup.nextFloat();
                result = mek + erku;
                result/=2;
                System.out.println("Result is -" + result);







    }

}