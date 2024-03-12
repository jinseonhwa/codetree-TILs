import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[4][4];

        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0; j<4; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                sum += map[i][j];
            }
            System.out.println(sum);
        }
    }
}