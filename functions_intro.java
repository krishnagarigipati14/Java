
import java.util.*;
public class functions_intro {

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void MyName(String name){

        System.out.println(name);

    }

    public static int sumofnumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args)   {
            printHelloWorld();
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            MyName(name);
            System.out.println(sumofnumbers(5,6));

        }
}

