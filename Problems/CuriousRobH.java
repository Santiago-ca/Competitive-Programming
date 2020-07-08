import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CuriousRobH {
	static int[] Bit;
	static int[] entr;
	static int n;
	
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
		for (int i = index; i>=0; i=(i&(i+1))-1) {
			res+=Bit[i];
		}
		return res;
	}
	
	public static int queryR(int i, int j) {
		return query(j)-query(i-1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(entrada.readLine()),q,c,v,k,aux;
		StringTokenizer linea;
		for (int i = 0; i < t; i++) {
			linea = new StringTokenizer(entrada.readLine());
			n=Integer.parseInt(linea.nextToken()); q= Integer.parseInt(linea.nextToken());
			entr = Arrays.stream(entrada.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Bit=new int[n];
			create();
			System.out.println("Case "+(i+1)+":");
			for (int j = 0; j < q; j++) {
				linea = new StringTokenizer(entrada.readLine());
				c=Integer.parseInt(linea.nextToken());
				if(c==1) {
					v=Integer.parseInt(linea.nextToken());
					System.out.println(entr[v]);
					if(!(entr[v]==0)) {
						add(v,0-entr[v]);
						entr[v]=0;
					}
				}
				else if(c==2) {
					v=Integer.parseInt(linea.nextToken());
					k=Integer.parseInt(linea.nextToken());
					add(v,k);
					entr[v]+=k;
				}
				else {
					v=Integer.parseInt(linea.nextToken());
					k=Integer.parseInt(linea.nextToken());
					System.out.println(queryR(v,k));
				}
			}
			
			
		}
	}

}
