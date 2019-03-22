import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BonAppetit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] bill = new int[n];
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            bill[i] = Integer.parseInt(st1.nextToken());
        }
        int chargedBill = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int actualBill=0, sum=0;
        for (int i=0;i<n;i++) {
            if (i!=k) {
                sum += bill[i];
            }
        }
        actualBill = sum/2;
        if (actualBill == chargedBill) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(chargedBill-actualBill);
        }
    }
}
