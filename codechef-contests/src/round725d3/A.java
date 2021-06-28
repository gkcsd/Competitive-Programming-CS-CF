package round725d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int T = fs.nextInt();
        while (T-- > 0) {
            int n=fs.nextInt();
            int[] a=fs.readArray(n);
            int i1=0, i2=0;
            for(int i=0; i<n; i++) {
                if(a[i]==1) {
                    i1=i;
                }else {
                    if(a[i]==n) {
                        i2=i;
                    }
                }
            }
            if(i1>i2) {
                int temp=i1;
                i1=i2;
                i2=temp;
            }
            int ans=Math.min(i2+1, Math.min(n-i1,  i1+1 + (n-i2)));
            System.out.println(ans);
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner( ) {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }
        public String next() {
            while (st==null || !st.hasMoreElements())
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
