import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class The3Plus1Problem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));

		long i,j,k,cont2=1,max=Integer.MIN_VALUE;
		StringTokenizer linea;
		while(entrada.ready()) {
			linea=new StringTokenizer(entrada.readLine());
			i=Long.parseLong(linea.nextToken());
			j=Long.parseLong(linea.nextToken());
			System.out.print(i+" "+j);
			while(i<=j) {
				k=i;
				while(k!=1) {
					if (k%2==0) { k/=2;}
					else { k=(k*3 +1);}
					cont2++;
				}
				//System.out.println(cont2);
				if(cont2>max) { max=cont2;}
				cont2=1;
				i++;
			}
			

			System.out.print(" "+max+"\n");

		}
	}

}
