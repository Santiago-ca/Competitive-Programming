import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ExtraTerIntell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		
		int n=Integer.parseInt(entrada.readLine()),cantCerR=-1,cantCerA,primU,ultU;
		boolean isInt=true;
		StringBuilder num = new StringBuilder(entrada.readLine()),aux;
		primU=num.indexOf("1");
		num.reverse();
		ultU=n-num.indexOf("1");
		num.reverse();
		num.replace(0, primU,"");
		num.replace(ultU-primU, num.length(), "");
		aux=new StringBuilder(num);
		aux.reverse();
		isInt=aux.toString().equals(num.toString());
		pw.println(isInt?"YES":"NO");
		pw.flush();
	}

}
