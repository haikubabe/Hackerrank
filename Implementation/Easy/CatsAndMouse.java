import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CatsAndMouse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (q>0) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int distCatAFromMouse = Math.abs(x-z);
            int distCatBFromMouse = Math.abs(y-z);
            if (distCatAFromMouse < distCatBFromMouse) {
                System.out.println("Cat A");
            } else if (distCatBFromMouse < distCatAFromMouse) {
                System.out.println("Cat B");
            } else {
                System.out.println("Mouse C");
            }
            q--;
        }
    }
}
