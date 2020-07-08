import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoDArrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer linea;
		int res;
		int[][] matriz=new int[6][6];
		for (int i = 0; i < 6; i++) {
			linea=new StringTokenizer(entrada.readLine());
			for (int j = 0; j < 6; j++) {
				matriz[i][j]=Integer.parseInt(linea.nextToken());
			}
		}
		res=calcHour(matriz,0);
		for (int i = 1; i < 4; i++) {
			res=Math.max(res, calcHour(matriz, i));
		}
		System.out.println(res);
	}

	public static int calcHour(int[][] arr, int posFil) {
		int cont=0,a,b,c,d,e,f,g;
		for (int i = 0; i <= arr.length-3; i++) {
			a=arr[posFil][i];
			b=arr[posFil][i+1];
			c=arr[posFil][i+2];
			d=arr[posFil+1][i+1];
			e=arr[posFil+2][i];
			f=arr[posFil+2][i+1];
			g=arr[posFil+2][i+2];
			if(i==0) cont= a+b+c+d+e+f+g;
			else cont=Math.max(cont, a+b+c+d+e+f+g);
		}
		return cont;
	}

}

