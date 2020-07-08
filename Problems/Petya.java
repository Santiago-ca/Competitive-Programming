import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Petya {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		String res="";
		int aux,n1,n2,n3;
		StringTokenizer linea;
		int ren=0;
		int casos = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < casos; i++) {
			linea = new StringTokenizer(entrada.readLine());
			n1=Integer.parseInt(linea.nextToken());
			n2=Integer.parseInt(linea.nextToken());
			n3=Integer.parseInt(linea.nextToken());
			
			if (n1+n2+n3>=2) {
				ren++;
			}
			res="";
		}
		//System.out.println(res);
		System.out.println(ren);
	}
}
