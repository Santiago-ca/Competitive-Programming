import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		long n=Integer.parseInt(entrada.readLine()),l,u,res,numR,aux;
		
		StringTokenizer linea;
		
		for (int i = 0; i < n; i++) {
			linea= new StringTokenizer(entrada.readLine());
			l=Integer.parseInt(linea.nextToken());u=Integer.parseInt(linea.nextToken());
			res=findDiv(l);
			numR=l;
			for (long j = l+1; j <= u; j++) {
				aux=findDiv(j);
				if(aux>res) {
					res=aux;
					numR=j;
				}
			}
			System.out.println("Between "+ l+ " and "+u+", "+ numR+" has a maximum of "+res+" divisors.");
		}
	}
	
	public static long findDiv(long x) {
		long numDiv=1,cont,p=2;
		while(p*p <=x) {
			cont=0;
			while(x%p==0) {
				x/=p;
				cont++;
			}
			cont++;
			numDiv*=cont;
			p++;
		}
		if(x!=1) numDiv*=2;
		return numDiv;
	}

}
