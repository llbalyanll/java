package das7;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
       int [] numbers =new int[5];
      for (int i=0; i< numbers.length;i++){
          numbers[i] =i*10;
        }
      for (int i =0; i<numbers.length;i++){
          System.out.println(numbers[i]);
      }
      System.out.println();
      int[] numbers1 = {1,2,3,4};
      for (int i =0; i<numbers1.length;i++) {
      System.out.println(numbers1 [i]);
       }
//        int [] number = new int[5];
//        number[0] = 10;
//       String[] strings= new String[3];
//         strings[0] = "Hello";
//            strings[1] = "barev";
//         strings[2] = "hajox";
//
//
//         for (int i=0;i<strings.length;i++){
//             System.out.println(strings[i]);
//         }
//         System.out.println();
//         for (String string:strings){
//             System.out.println(string);
//
//         }
//        int[] numbers1={1,2,3};
//         int sum =0;
//         for (int x:numbers1){
//            sum = sum+x;
//         }
//        System.out.println();
//        System.out.println(sum);


//         int [] numbers={1,2,3};

         int[] [] matrice = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};
         System.out.println(matrice[2][2]);
         System.out.println(matrice[1][2]);
         int[] number1 =new int[5];

         String [] [] string1 = new String[2][3];
         string1[0][1] = "Barev dzez";
         System.out.println(string1[0][1]);
        for (int i =0;i<matrice.length;i++){
            for (int j =0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j]+" ");

            }
            System.out.println();
        }
    }
}