import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DesignerPDFViewer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] h = new int[26];
        for (int i=0;i<26;i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        String str = new StringTokenizer(bufferedReader.readLine()).nextToken();
        int width = str.length();
        int maxHeight = -1;
        for (int i=0;i<width;i++) {
            char c = str.charAt(i);
            int height = h[c-97];
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        System.out.println(maxHeight*width);
    }
}
