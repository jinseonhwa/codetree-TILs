import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[2][4];

        for(int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<2; i++) {
            int sum = 0;
            for(int j=0; j<4; j++) {
                sum += map[i][j];
            }
            Double value = (double) sum;
            System.out.print(String.format("%.1f", value/4)+" ");
        }
        System.out.println();

        for(int i=0; i<4; i++) {
            int sum = 0;
            for(int j=0; j<2; j++) {
                sum += map[j][i];
            }
            Double value = (double) sum;
            System.out.print(String.format("%.1f", value/2)+" ");
        }
        System.out.println();

        int sum = 0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                sum += map[i][j];
            }
        }
        Double value = (double) sum;
        System.out.print(String.format("%.1f", value/8)+" ");
    }
}