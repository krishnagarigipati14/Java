// USING IF ELSE TO FIND OUT WHETHER A GIVEN NUMBER IS EVEN OR ODD.

import java.util.Scanner;

public class ifelsestatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("It is an even number.");
        }
        else{
            System.out.println("It is an odd no. ");
        }
    }
}
