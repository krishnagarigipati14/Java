import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] numbers = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                numbers[i][j] = sc.nextInt();

            }
        }

        for(int a = 0; a<3; a++){
            for(int k = 0; k<3; k++){
                System.out.print(numbers[a][k] + " ");
            }
            System.out.println();
        }

    }
}