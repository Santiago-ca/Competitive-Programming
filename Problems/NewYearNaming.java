import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewYearNaming {

	static String tp[], np[];
	static int t,n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int q,y;
		StringTokenizer linea = new StringTokenizer(entrada.readLine());
		t = Integer.parseInt(linea.nextToken());n=Integer.parseInt(linea.nextToken());
		tp = entrada.readLine().split(" ");np= entrada.readLine().split(" ");
		q=Integer.parseInt(entrada.readLine());
		for (int i = 0; i < q; i++) {
			y=Integer.parseInt(entrada.readLine());
			System.out.println(findYN(y));
		}
	}
	
	public static String findYN(int y) {
		StringBuilder res = new StringBuilder("");
		int yt=y,yn=y;
		if(y>t) yt%=t;
		if(yn>n) yn%=n;
		if(yt==0 || yt==t) res.append(tp[tp.length-1]);
		else res.append(tp[yt-1]);
		if(yn==0 || yn==n) res.append(np[np.length-1]);
		else res.append(np[yn-1]);
		return res.toString();
		
	}

}
