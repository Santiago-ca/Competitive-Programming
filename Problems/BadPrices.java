import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BadPrices {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		String res="";
		long menor;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int ren=0;
		String[] linea;
		int casos = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < casos; i++) {
			linea = new String[Integer.parseInt(entrada.readLine())];
			linea = entrada.readLine().split(" ");
			menor=Long.parseLong(linea[linea.length-1]);
			//System.out.println(Arrays.toString(linea));
			for (int j = linea.length-1; j >=0 ; j--) {
				//System.out.println(Long.parseLong(linea[j]));
				if(Long.parseLong(linea[j])>menor ) {
					ren++;
				}
				else if(Long.parseLong(linea[j])<menor) {
					menor = Long.parseLong(linea[j]);
				}
			}
			System.out.println(ren);
			ren=0;
		}
	}
}
