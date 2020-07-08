import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindColor {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int x, y;

		StringTokenizer linea = new StringTokenizer(entrada.readLine());
		x=Integer.parseInt(linea.nextToken());y=Integer.parseInt(linea.nextToken());
		calcColor(x,y);

	}

	public static void calcColor(int x, int y) {
		double ratio = calcRatio(x, y),aux=Math.floor(ratio);
		//System.out.println(ratio);
		if(x==0 || y==0) System.out.println("black");
		else if((x>=0&&y>=0) || (x<=0&&y<=0)) {
			if(aux%2==0) {
				System.out.println(aux%2==0?"black":"white");
			}
			else {
				if(ratio>aux) System.out.println(aux%2==0?"black":"white");
				else System.out.println(aux%2==0?"white":"black");
			}
		}
		else {
			if(aux%2==0) {
				if(ratio>aux) System.out.println(aux%2==0?"white":"black");
				else System.out.println(aux%2==0?"black":"white");
			}
			else {
				System.out.println(aux%2==0?"white":"black");
			}

		}


	}

	public static double calcRatio(int x, int y){
		return Math.sqrt((x*x)+(y*y));
	}
}
