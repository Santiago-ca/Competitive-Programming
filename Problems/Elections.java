import java.io.*;
import java.util.StringTokenizer;

public class Elections {
	static int v[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(entrada.readLine()),c=0;
		StringTokenizer linea=new StringTokenizer(entrada.readLine());
		v=new int[n];
		for (int i = 0; i < n; i++) {
			v[i]=Integer.parseInt(linea.nextToken());
			c+=v[i];
		}
		System.out.println(check(c)?"1":"2");
	}

	public static boolean check(int cV) {
		boolean isW=true;
		for (int i = 0; i < v.length; i++) {
			if(v[i]>= cV*0.45) return true;
			else {
				if(v[i]>=cV*0.4) {
					isW=true;
					for (int j = 0; j < v.length; j++) {
						if(i==j) continue;
						if((v[i]-v[j]<cV*0.1 )) {
							isW= false;
							break;
						}
					}	
					if(isW) return true;
				}
			}
		}
		return false;
	}
}
