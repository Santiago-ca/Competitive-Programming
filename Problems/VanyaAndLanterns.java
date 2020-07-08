import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));

		StringTokenizer linea;
		long n,l;
		String numeros[];
		double rad=Integer.MIN_VALUE;
		
		linea = new StringTokenizer(entrada.readLine());
		n = Long.parseLong(linea.nextToken());l = Long.parseLong(linea.nextToken());
		numeros = entrada.readLine().split(" ");
		int[] array = Arrays.stream(numeros).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		if((array[0])!=0 || (array[array.length-1])-l!=0) {
			rad = Math.max(array[0]-0,Math.abs(array[array.length-1]-l));
		}
		for (int i = 0; i < numeros.length-1; i++) {
			if((array[i]+rad)<(array[i+1]-rad)) {
				rad=Math.abs(((array[i]-array[i+1])*1.0)/2);
			}
		}
		System.out.printf("%.10f\n", rad);
	}

}
