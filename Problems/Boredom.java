import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boredom {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		String res="";

		int ren=0;
		long dp[]=new long[100001],num2[]=new long[100001];
		int num = Integer.parseInt(entrada.readLine());
		StringTokenizer linea = new StringTokenizer(entrada.readLine());
		for (int i = 0; i < num; i++) {
			num2[(int) Long.parseLong(linea.nextToken())]-=-1;
		}
		for (int i = 0; i < dp.length; i++) {
			if(i<2) dp[i]=num2[i]*i;
			else if(i==2) dp[i]=dp[0]+num2[i]*i;
			else dp[i]=Math.max(dp[i-3], dp[i-2])+num2[i]*i;
		}
		System.out.println(Math.max(dp[dp.length-1], dp[dp.length-2]));
	}
}
