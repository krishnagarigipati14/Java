public class inverted_half_pyramid {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) { // Outer loop controls rows, starts at 4 and decreases
            for (int j = 1; j <= i; j++) { // Inner loop controls columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
