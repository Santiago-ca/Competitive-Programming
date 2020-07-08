import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class TriangleWave {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,String> valores = new HashMap<Integer, String>();
		valores.put(1, "1");valores.put(2, "22");valores.put(3, "333");valores.put(4, "4444");
		valores.put(5, "55555");valores.put(6, "666666");valores.put(7, "7777777");
		valores.put(8, "88888888");valores.put(9, "999999999");

		StringBuilder word = new StringBuilder("");
		StringTokenizer linea;
		boolean upping;
		int a,f,j;
		int casos = Integer.parseInt(entrada.readLine());
		for (int i = 1; i <= casos; i++) {
			word=new StringBuilder("");
			entrada.readLine();
			a=Integer.parseInt(entrada.readLine());f=Integer.parseInt(entrada.readLine());
			j=1;
			upping=true;
			if(a==1) {
				for(int k=0;k<f;k++) {
					System.out.println(1);
					if(!(k+1>=f))System.out.println();
				}
				System.out.println();
				continue;
			}
			while(j>=1) {
				if(j==a) { 
					word.append(valores.get(j)+"\n");
					upping=false;
				}
				else {
					if(j==1&&!upping) word.append(valores.get(j));
					else word.append(valores.get(j)+"\n");
				}
				if(upping) j++;
				else j--;
			}
			for (int k = 0; k < f; k++) {
				System.out.println(word);
				if(!(k+1>=f))System.out.println();
			}
			if(!(i==casos))System.out.println();
		}



	}

}
