import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SaveThePrisoner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(entrada.readLine()),n,m,s,badC;
		
		StringTokenizer linea ;
		
		for (int i = 0; i < t; i++) {
			linea = new StringTokenizer(entrada.readLine());
			n=Integer.parseInt(linea.nextToken());m=Integer.parseInt(linea.nextToken());s=Integer.parseInt(linea.nextToken());
			if(m<n) {
				if(m+s>n) {
					badC=(m+s-1)%n;
				}
				else badC=m+s-1;
			}
			else {
				//System.out.println(m+" "+n);
				m=m%n;
				if(m+s>n) {
					badC=(m+s-1)%n;
				}
				else badC=m+s-1;
			}
			System.out.println(badC==0?n:badC);
		}
	}

}
