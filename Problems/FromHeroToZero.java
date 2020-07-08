import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FromHeroToZero {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		String res="";
		long ren=0,n,k;
		StringTokenizer linea;
		int casos = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < casos; i++) {
			linea = new StringTokenizer(entrada.readLine());
			n=Long.parseLong(linea.nextToken());
			k=Long.parseLong(linea.nextToken());
			while(n!=0) {
				if (n%k==0) { n/=k;ren++;}
				else {ren+=(n%k);n=n-(n%k);}
				//System.out.println(n);
			}
			System.out.println(ren);
			ren=0;
		}
	}
}
