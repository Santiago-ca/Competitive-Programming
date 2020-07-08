import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HomerSimpson {
	static int dp[];
	static int m,n;
	static final int INF=Integer.MAX_VALUE;
	
	public static int TtoB(int t) {
		if(dp[t]!=-INF) return dp[t];
		int x=-INF;
		if(t>=m) {
			x=Math.max(x, TtoB(t-m));
		}
		if(t>=n) {
			x=Math.max(x, TtoB(t-n));
		}
		return dp[t]=x+1;
		
	}
	public static void BToU(int t) {
		dp[0]=0;
		int x;
		int tiempo[]= {m,n};
		for (int i = 1; i <= t; i++) {
			x=-INF;
			for(int ham : tiempo) {
				if(i<ham) continue;
				x=Math.max(x, dp[i-ham]);
			}
			dp[i]=x+1;
		}
		x=0;
		while(dp[t]<0) {
			x++;
			t--;
		}
		if(x!=0)
			System.out.println(dp[t]+" "+x);
		else
			System.out.println(dp[t]);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader fr=new FastReader();
		int t,dist;
		while(fr.ready()) {
			m=fr.nextInt();n=fr.nextInt();
			t =fr.nextInt();
			dp= new int[t+1];
			//Arrays.fill(dp, -INF);
			//dp[0]=0;
			dist=0;
			BToU(t);
			//System.out.println(Arrays.toString(dp));
//			while(dp[t-dist]==-INF) dist++;
//			//System.out.println(Arrays.toString(dp));
//			System.out.println(dist==0?dp[t]:dp[t-dist]+" "+dist);
		}
	}

	static class FastReader {
		BufferedReader bf;
		StringTokenizer st;

		public FastReader() throws FileNotFoundException  {
			bf = new BufferedReader(new InputStreamReader(System.in));
			//bf = new BufferedReader(new FileReader("pruebas.txt"));
		}
		String next() {
			while(st == null || !st.hasMoreElements())
				try {
					st = new StringTokenizer(bf.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt()  {
			return Integer.parseInt(next());
		}
		long nextLong()  {
			return Long.parseLong(next());
		}
		double nextDouble()  {
			return Double.parseDouble(next());
		}
		String nextLine() throws IOException {
			return bf.readLine();
		}
		boolean ready() throws IOException {
			return bf.ready() || (st != null && st.hasMoreElements());
		}
	}


}
