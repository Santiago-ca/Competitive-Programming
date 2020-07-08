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

public class Prim {
	static ArrayList<Edge> list[];
	static int v,e;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader fr=new FastReader();
		ArrayList<Integer> pf=new ArrayList<Integer>(),pt=new ArrayList<Integer>(),pw=new ArrayList<Integer>();
		Set<Integer> num= new TreeSet<Integer>();
		int f,t,w;
		Integer aux[];
		while(fr.ready()) {
			v=fr.nextInt();e=fr.nextInt();
			num.clear();
			pf.clear();pt.clear();pw.clear();
//			for (int i = 0; i < e; i++) {
//				f=fr.nextInt();t=fr.nextInt();w=fr.nextInt();
//				num.add(f);num.add(t);
//				pf.add(f);pt.add(t);pw.add(w);
//			}
			
			//System.out.println("s");
			list=new ArrayList[v];
			aux=num.toArray(new Integer[0]);
			for (int i = 0; i < v; i++) list[i]=new ArrayList<Edge>();
			for (int i = 0; i < e; i++) {
				f=fr.nextInt();t=fr.nextInt();w=fr.nextInt();
				//f=pf.get(i);t=pt.get(i);w=pw.get(i);
				//f=Arrays.binarySearch(aux, f);t=Arrays.binarySearch(aux, t);
				list[f-1].add(new Edge(t-1,w));
				list[t-1].add(new Edge(f-1,w));
			}
			if(e<=1) {
				System.out.println(0);
				continue;
			}else if(v==0){
				System.out.println("Imposible");
				continue;
			}
			int res=prim(0);
			System.out.println(res==-1?"Imposible":res);
		}

	}

	public static int prim(int NodIn) {
		boolean visit[]= new boolean[v];
		int menDist=0,nodo=-1,res=0,aux=0,aux2=0,def=0;

		Queue<Integer> N=new LinkedList<Integer>();
		ArrayList<Integer> numNodos=new ArrayList<Integer>();
		N.add(NodIn);
		visit[NodIn]=true;
		numNodos.add(NodIn);
		while(numNodos.size()!=v) {
			menDist=Integer.MAX_VALUE;
			for (Integer x : N) {
				aux2=0;
				for (Edge e : list[x]) {
					if(!visit[e.to]) {
						if(e.weight<menDist) {
							menDist=e.weight;
							nodo=e.to;
							aux=x;
							def=aux2;
						}
						aux2++;
					}
				}
			}
			if(menDist==Integer.MAX_VALUE) break;
			list[aux].remove(def);
			visit[nodo]=true;
			numNodos.add(nodo);
			N.add(nodo);
			res+=menDist;
		}
		return numNodos.size()!=v?-1:res;
	}




	static class Edge {
		int to;
		int weight;

		public Edge() {

		}
		public Edge(int t, int w) {
			this.to=t;
			this.weight=w;
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
