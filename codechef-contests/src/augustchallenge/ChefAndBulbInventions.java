package augustchallenge;
//Author- GKCSD

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ChefAndBulbInventions {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
          int n = fs.nextInt();
          int p = fs.nextInt();
          int k = fs.nextInt();
          int d = 0;
          int m = (p%k)-1;
          int x = n - 1 - ((n-1)/k)*k;

          if(m > x) {
              d += (x+1)*((n-1) / k + 1) + (m-x) * ((n-1) / k);
          }else{
              d += ((n-1)/k+1) * (m+1);
          }

          for(int i = m+1; i < n; i +=k) {
              d++;
              if(i == p)
                  break;
          }
            System.out.println(d);
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
