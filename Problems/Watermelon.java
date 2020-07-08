import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		if(n%2==0 && n!=2) System.out.println("YES");
		else System.out.println("NO");
		
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
