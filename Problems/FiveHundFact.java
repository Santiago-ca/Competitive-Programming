import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class FiveHundFact {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		while(entrada.ready()) {
			int num = Integer.parseInt(entrada.readLine());
			System.out.println(num+"!");
			System.out.println(calcFact(num));
		}
	}	

	public static BigInteger calcFact(int num) {
		BigInteger res = new BigInteger("1");
		for (int i = num ; i >= 1; i--) {
			res=res.multiply(new BigInteger(String.valueOf(i)));
		}
		return res;
	}

}
