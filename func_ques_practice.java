import java.util.Scanner;

public class func_ques_practice {
    public static int greater(int a, int b){
        if(a>b){
            return a;
        }

        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = greater(a,b);
        System.out.println(result);



    }
}
