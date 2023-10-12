import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Marks[] = new int[size];
        for(int i = 0; i<size; i++){
            Marks[i] = sc.nextInt();
        }

        for(int j = 0; j<size; j++){
            System.out.println(Marks[j]);
        }
    }
}
