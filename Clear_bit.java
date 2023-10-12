public class Clear_bit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bm = 1<<pos;
        int x = ~(bm);
        int nn = x&n;
        System.out.println(nn);
    }
}
