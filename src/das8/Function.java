package das8;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
     func(2,4);
     array();
    }
    public static int [] array () {
        int [] arr;
        int n;
        Scanner in =new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i =0;i<n;i++)
            arr[i] = in.nextInt();
        return arr;
    }
  public static void func (int a,int b){
        int result =1;
        for (int i =0;i <b;i++)
            result *=a;
        System.out.print(result);


    }
}
