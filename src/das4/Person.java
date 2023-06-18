package das4;

public class Person {

        public int height = 180;
        public String name = "Default";
        public void say (String name){
            System.out.println("Hello,"+name);
        }
        public Person (int h,String n){
            name= n;
            height = h;
        }

     }


