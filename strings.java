import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String name = "KRISHNA";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        System.out.println(name2);




        String name3 = sc.nextLine();

        if(name2.equals(name3)){
            System.out.println("This name is already given. ");
        }

        else{
            System.out.println("Thanks for the information");
        }

        String line = "My name is RAGHAV";
        String Substring = line.substring(11);
        System.out.println(Substring);


    }
}
