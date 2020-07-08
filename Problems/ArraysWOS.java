
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraysWOS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(entrada.readLine()),n,odd,ev;
		StringTokenizer linea;
		for (int i = 0; i < t; i++) {
			ev=odd=0;
			n = Integer.parseInt(entrada.readLine());
			linea = new StringTokenizer(entrada.readLine());
			for (int j = 0; j < n; j++) {
				if(Integer.parseInt(linea.nextToken())%2==0) ev++;
				else odd++;
			}
			if(odd==0) System.out.println("NO");
			else if(ev==0) {
				if(odd%2!=0)System.out.println("YES");
				else System.out.println("NO");
			}
			else System.out.println("YES");
			
		}
	}


}
