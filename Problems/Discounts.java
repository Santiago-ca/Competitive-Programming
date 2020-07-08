import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Discounts {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(entrada.readLine()),a[]=new int[n],m,q;
		long contTot=0;
		StringTokenizer linea = new StringTokenizer(entrada.readLine());
		for (int i = 0; i < n; i++) {
			a[i]=Integer.parseInt(linea.nextToken());
			contTot+=a[i];
		}
		Arrays.sort(a);
		m=Integer.parseInt(entrada.readLine());
		linea = new StringTokenizer(entrada.readLine());
		for (int i = 0; i < m; i++) {
			q=Integer.parseInt(linea.nextToken());
			System.out.println(contTot-a[a.length-q]);
		}
		
	}

}
