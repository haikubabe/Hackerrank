import java.util.Scanner;

public class TaumAndBDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            long b = sc.nextLong();
            long w = sc.nextLong();
            long bc = sc.nextLong();
            long wc = sc.nextLong();
            long z = sc.nextLong();
            if (bc>wc && bc>(wc+z)) {
                System.out.println(b*z + (b+w)*wc);
            } else if (wc>bc && wc>(bc+z)) {
                System.out.println(w*z + (b+w)*bc);
            } else {
                System.out.println(b*bc+w*wc);
            }
            t--;
        }
    }
}
