import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MinimumKnightMoves {
	static ArrayList<Integer> list[];
	static int n;

	public static boolean isReach(int x, int y) {
		return ((x>=0 && y>=0) && (x<=7 && y<=7));
	}
	public static int bfs(Posicion from, Posicion to) {
		int dis[][]=new int[8][8],dx[]= {-2,-1,1,2,2,1,-1,-2},dy[]={1,2,2,1,-1,-2,-2,-1},x,y;
		Posicion temp;
		boolean vis[][] = new boolean[8][8];
		Queue<Posicion> q = new LinkedList<Posicion>();
		q.add(from);
		vis[from.x][from.y]=true;
		while(!q.isEmpty()) {
			temp=q.poll();
			for (int i = 0; i < 8; i++) {
				x=temp.x+dx[i]; y=temp.y+dy[i];
				if(!isReach(x,y)) continue;
				if(vis[x][y]) continue;
				dis[x][y]=dis[temp.x][temp.y]+1;
				vis[x][y]=true;	
				q.add(new Posicion(x,y));
			}
		}
		return dis[to.x][to.y];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr=new FastReader();
		int cas=fr.nextInt();
		String aux1,aux2;
		Posicion f,t;
		for (int i = 0; i < cas; i++) {
			aux1=fr.next();
			aux2=fr.next();
			f=new Posicion(aux1.charAt(0)-97,aux1.charAt(1)-49);
			t=new Posicion(aux2.charAt(0)-97,aux2.charAt(1)-49);
			System.out.println(bfs(f,t));
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
	
	static class Posicion{
		int x,y;

		public Posicion(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
	}


}
