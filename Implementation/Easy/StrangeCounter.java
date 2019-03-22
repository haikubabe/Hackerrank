import java.util.Scanner;

public class StrangeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long num=3;
        while (t>num) {
            t = t-num;
            num *= 2;
        }
        System.out.println(num-t+1);
    }
}
