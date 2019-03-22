import java.util.Scanner;

public class HappyLadyBugs {

    private static boolean isSingleOccurrence(int[] count) {
        for (int i=0;i<26;i++) {
            if (count[i]==1) {
                return true;
            }
        }
        return false;
    }

    private static boolean happy(String b, int n) {
        if (b.length() == 1) {
            return false;
        }
        int i;
        for (i=1;i<n-1;i++) {
            if (b.charAt(i)!=b.charAt(i-1) && b.charAt(i)!=b.charAt(i+1)) {
                return false;
            }
        }
        return (b.charAt(i)==b.charAt(i-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        while(g>0) {
            int n = sc.nextInt();
            String b = sc.next();
            int[] count = new int[26];
            boolean hasSpace=false;
            for (int i=0;i<n;i++) {
                if (b.charAt(i) != '_') {
                    count[b.charAt(i)-'A']++;
                } else {
                    hasSpace=true;
                }
            }
            if (hasSpace) {
                if (isSingleOccurrence(count)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                boolean isHappy = happy(b,n);
                if (isHappy) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            g--;
        }
    }
}
