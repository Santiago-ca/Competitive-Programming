import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueriesOnAString {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));

		int l,r,k,casos;
		StringBuilder respuesta= new StringBuilder("");
		StringBuilder aux=new StringBuilder("");
		StringTokenizer linea;
		respuesta=new StringBuilder(entrada.readLine());
		casos = Integer.parseInt(entrada.readLine());

		for (int i = 0; i < casos; i++) {
			if(respuesta.length()==1) break;
			linea = new StringTokenizer(entrada.readLine());
			l=Integer.parseInt(linea.nextToken());r=Integer.parseInt(linea.nextToken());k=Integer.parseInt(linea.nextToken());
			if(r-l==0)continue;
			if(k>r-l+1) k%=(r-l+1);
			if (k!=0) {
				aux.append(respuesta);
				aux.delete(r,aux.length());aux.delete(0,r-k );
				respuesta.delete(r-k,r);
				respuesta.insert(l-1, aux);
			}
			aux=new StringBuilder("");
		}
		System.out.println(respuesta);
	}
}
