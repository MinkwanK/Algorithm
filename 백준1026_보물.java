import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int[] temp = new int[n];
        int result = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for(int i = 0; i<n;i++){
            int max = B[0];
            int maxIndex = 0;
            for(int j = 0; j<n;j++){
                if(max<B[j]){
                    max = B[j];
                    maxIndex = j;
                }
            }

            result += A[i]*B[maxIndex];
            B[maxIndex] = -1;
        }


        System.out.println(result);


    }

}
