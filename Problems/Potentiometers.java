import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Potentiometers {
	
	static int[] Bit;
	static int[] entr;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter("pruebas.txt");
		StringTokenizer linea;
		String q;
		int x,y,caso=1;
		while(true) {
			n = Integer.parseInt(entrada.readLine());
			if(n==0) break;
			else if(caso!=1) {
				pw.print("\n");
				pw.flush();
			}
			entr=new int[n];
			Bit=new int[n];
			for (int i = 0; i < n; i++) {
				entr[i]=Integer.parseInt(entrada.readLine());
			}
			create();
			//System.out.println("Case "+caso+":");
			pw.print("Case "+caso+":\n");
			pw.flush();
			while(true) {
				linea = new StringTokenizer(entrada.readLine());
				q=linea.nextToken();
				if(q.equals("END")) break;
				x=Integer.parseInt(linea.nextToken())-1;y=Integer.parseInt(linea.nextToken())-1;
				if(q.equals("M")) {
					//System.out.println(queryRange(x, y));
					pw.print(queryRange(x,y)+"\n");
					pw.flush();
				}
				else{
					add(x,y+1-entr[x]);
					entr[x]=y+1;
				}
			}
			caso++;
		}
		
	}
	
	public static void add(int index, int valor) {
		for (int i = index; i < n; i=(i|(i+1))) {
			Bit[i]+=valor;
		}
	}
	
	public static void create() {
		for (int i = 0; i < n; i++) {
			add(i,entr[i]);
		}
	}
	
	public static int query(int index) {
		int res=0;
		for (int i =index; i >= 0; i=(i&(i+1))-1) {
			res+=Bit[i];
		}
		return res;
	}
	
	public static int queryRange(int i, int j) {
		return query(j)-query(i-1);
	}
}
