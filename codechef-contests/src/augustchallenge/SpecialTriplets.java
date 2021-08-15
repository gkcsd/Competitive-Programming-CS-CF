package augustchallenge;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TC- O(n^3) & AS- O(1)
public class SpecialTriplets {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0){
            int n = fs.nextInt();
            int count = 0;
            for(int i = 1 ; i <= n; i++) {
                for(int j = i; j <= n; j+=i) {
                    if(j%i == 0) {
                        for(int k = i; k <= n; k+=j) {
                            if(k%j == i)
                                count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat() {
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
