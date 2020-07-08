import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NewYearTransportation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"))	;
		
		long n,t,aux=0,aux2=0;
		StringTokenizer linea=new StringTokenizer(entrada.readLine());
		n=Integer.parseInt(linea.nextToken());t=Integer.parseInt(linea.nextToken());
		String[] lugares=entrada.readLine().split(" ");
		int[] numeros = Arrays.stream(lugares).mapToInt(Integer::parseInt).toArray();
		for ( aux = 1; true;) {
			aux2=aux;
			if(t==aux) {
				System.out.println("YES");
				break;
			}
			else if(aux>t || aux2++>numeros.length) {
				System.out.println("NO");
				break;
			}else {
				aux+=numeros[(int) aux-1];
			}
		}

		
	}

}
