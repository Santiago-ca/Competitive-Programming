import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int casos=Integer.parseInt(entrada.readLine()),h,m,res;
		StringTokenizer linea;
		for (int i = 0; i < casos; i++) {
			linea = new StringTokenizer(entrada.readLine());
			res=0;
			h=Integer.parseInt(linea.nextToken());m=Integer.parseInt(linea.nextToken());
			res+=60-m;
			res+=(23-h)*60;
			System.out.println(res);
		}
	}

}
