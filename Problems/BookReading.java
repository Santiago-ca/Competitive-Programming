import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BookReading {
	public static HashMap<Long,Long> numeros = new HashMap<Long,Long>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		long q = Integer.parseInt(entrada.readLine()),n,m,sec,n1=10,n2=45,n3=5,n4=20,n5=2,n6=5,n7=1,n8=45;
		StringTokenizer linea;
		numeros.put(n1, n2);
		numeros.put(n3, n4);
		numeros.put(n5, n6);
		numeros.put(n7, n8);
		for (long i = 0; i < q; i++) {
			linea = new StringTokenizer(entrada.readLine());
			n=Long.parseLong(linea.nextToken());m=Long.parseLong(linea.nextToken());
			
			sec=calcSec(m);
			System.out.println(genSec(m, n, sec));
		}
		
	}
	
	
	public static long genSec(long m,long n,long sec) {
		long cont=0,multip=0;
		if(m>n || (m%10==0 && m>9)) return 0;
		if(sec==1 && n>=10) {
			cont= (numeros.get(sec)*(n/10));
			for (long i = 1; i <= n%10; i++) {
				cont+=i%10;
			}
			return cont;
	}
		if(m*2>n || m==n) return m%10;
		if((m*sec < n) && (m!=1) ) {
			multip=(long) Math.floor(n*1.0/(m*sec)*1.0);
			cont=numeros.get(sec)*multip;
			for (long i = (m*sec)*multip; i <= n; i+=m) {
				cont+=i%10;
			}
		}
		else {
			for (long i = m; i <= n; i+=m) {
				cont+=i%10;
			}
		}
		return cont;
	}
	public static long calcSec(long n) {
		if(n==1) return 1;
		else if(n%5==0) return 2;
		else if(n%2==0) return 5;
		else return 10;
	}

}
