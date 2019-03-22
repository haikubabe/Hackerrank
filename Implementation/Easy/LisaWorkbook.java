import java.util.Scanner;

public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int specialProblem = 0, currentPage = 0;
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            int p = arr[i];
            int q = p;
            int m=1,s=1,j;
            if (p>=k) {
                while (p>=k) {
                    currentPage++;
                    for (j=m;j<=k*s;j++) {
                        if (j == currentPage) {
                            specialProblem++;
                        }
                    }
                    p = p-k;
                    m = j;
                    s++;
                }
                if (m <= q) {
                    currentPage++;
                    for (j=m;j<=q;j++) {
                        if (j == currentPage) {
                            specialProblem++;
                        }
                    }
                }
            } else {
                currentPage++;
                for (j=1;j<=p;j++) {
                    if (j == currentPage) {
                        specialProblem++;
                    }
                }
            }
        }
        System.out.println(specialProblem);
    }
}
