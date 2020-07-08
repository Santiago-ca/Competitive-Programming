import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader fr= new FastReader();
		int n=fr.nextInt(),k=fr.nextInt(),aux1,aux2,tot=0;
		String par[]=fr.nextLine().split(" ");
		aux2=Integer.parseInt(par[k-1]);
		for (int i = 0; i < par.length; i++) {
			aux1=Integer.parseInt(par[i]);
			if(aux1>=aux2 && aux1>0) tot++;
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
