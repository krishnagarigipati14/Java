import java.util.Scanner;

public class loops_testing {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        while(a.equals("Hello") || a.equals("hello")){
            System.out.println("Hi");
            a = sc.nextLine(); // Update the value of 'a' to allow exiting the loop.
        }





    }
}
