import java.util.Scanner;

public class KaprekarNumbers {
    private static boolean isKaprekar(int n) {
        long sq = (long) n*n;
        String s = String.valueOf(sq);
        String l = s.substring(0,s.length()/2);
        String r = s.substring(s.length()/2, s.length());
        int left = 0;
        if (!l.isEmpty()) {
            left = Integer.parseInt(l);
        }
        int right = 0;
        if (!r.isEmpty()) {
            right = Integer.parseInt(r);
        }
        return (n == (left + right));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        StringBuilder st = new StringBuilder();
        for (int i=p;i<=q;i++) {
            if (isKaprekar(i)) {
                st.append(i + " ");
            }
        }
        if (st.toString().isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(st.toString());
        }
    }
}
