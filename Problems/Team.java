import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr= new FastReader();
		int casos= fr.nextInt(),sum,tot=0,i;
		while(casos-->0) {
			i=3;
			sum=0;
			while(i-->0) sum+=fr.nextInt();
			tot+=(sum>=2?1:0);
		}
		System.out.println(tot);
	}
	

	static class FastReader {
			BufferedReader bf;
			StringTokenizer st;

			public FastReader()  {
				bf = new BufferedReader(new InputStreamReader(System.in));
				//bf = new BufferedReader(new FileReader("p.txt"));
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
