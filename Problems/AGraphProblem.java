import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AGraphProblem {
	static long gr[] = new long[100001];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while(entrada.ready()) {
			n=Integer.parseInt(entrada.readLine());
			System.out.println(calcGr(n));
		}
	}
	
	public static long calcGr(int i) {
		gr[1]=1;gr[2]=2;gr[3]=2;
		for (int j = 4; j <=i; j++) {
			gr[j]=gr[j-2]+gr[j-3];
		}
		return gr[i];
	}

}
