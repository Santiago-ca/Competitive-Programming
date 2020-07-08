import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ANodeToFar {
	static ArrayList<Integer> list[];
	static int n;

	public static int bfs(int from, int ttl ) {
		int dis[]=new int[n], temp;
		boolean vis[] = new boolean[n];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(from);
		vis[from]=true;
		while(!q.isEmpty()) {
			temp=q.poll();
			for (Integer integer : list[temp]) {
				if(!vis[integer]) {
					vis[integer]=true;
					dis[integer]=dis[temp]+1;
					q.add(integer);
				}
			}
		}
		temp=0;
		for (int i = 0; i < vis.length; i++) {
			if(!(vis[i] && dis[i]<=ttl)) temp++; 
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr = new FastReader();

		int m,f,t,caso=1;
		Integer aux[];
		ArrayList<Integer> pf=new ArrayList<Integer>(),pt=new ArrayList<Integer>();
		Set<Integer> num= new TreeSet<Integer>();
		while ((m = fr.nextInt()) != 0){
			num.clear();
			pf.clear();pt.clear();
			m=fr.nextInt();
			if(m==0) break;
			for (int i = 0; i < m; i++) {
				f=fr.nextInt();t=fr.nextInt();
				num.add(f);num.add(t);
				pf.add(f);pt.add(t);
			}
			n=num.size();
			list=new ArrayList[n];
			aux=num.toArray(new Integer[0]);
			for (int i = 0; i < n; i++) list[i]=new ArrayList<Integer>();
			for (int i = 0; i < pf.size(); i++) {
				f=pf.get(i);t=pt.get(i);
				f=Arrays.binarySearch(aux, f);t=Arrays.binarySearch(aux, t);
				list[f].add(t);
				list[t].add(f);
			}
			f=fr.nextInt();t=fr.nextInt();
			while(f+t>0) {
				System.out.print("Case "+caso+": ");
				System.out.print(bfs(Arrays.binarySearch(aux,f), t));
				System.out.println(" nodes not reachable from node "+f+" with TTL = "+t+".");
				f=fr.nextInt();t=fr.nextInt();
				caso++;
			}

		}

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

