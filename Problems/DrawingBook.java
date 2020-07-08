import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(entrada.readLine()), p=Integer.parseInt(entrada.readLine()),distD,distI=0;
		if(n%2==0) {
            distI=1;
            n--;
        }
		distD=(int) Math.floor(p*1.0/2*1.0); distI+=(int) Math.floor((n-p)*1.0/2*1.0);
		System.out.println(Math.min(distD, distI));
		
	}
}
