public class Get_bit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bm = 1<<pos;

        if((bm&n) == 0){
            System.out.println("Bit was 0");
        }

        else{
            System.out.println("Bit was 1");
        }
    }
}
