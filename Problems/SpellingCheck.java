import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SpellingCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder wrongWord = new StringBuilder(entrada.readLine());
		StringBuilder rightWord = new StringBuilder(entrada.readLine()),aux;
		int cont=0;
		String aux2;
		ArrayList<Integer> pos=new ArrayList<Integer>();
		for (int i = 0; i <wrongWord.length(); i++) {
			aux=new StringBuilder("");
			aux.append(wrongWord.substring(0,i));
			aux.append(wrongWord.substring(i+1,wrongWord.length()));
			if (aux.toString().contains(rightWord.toString())) {
				cont++;
				pos.add(i+1);
			}
		}
		if(cont==0) System.out.println(0);
		else {
			System.out.println(cont);
			System.out.println(pos.toString().replace("[","").replace("]", "").replace(",", ""));
		}
		
	}
//if(!(wrongWord.charAt(i)+"").equals(rightWord.charAt(i)+""))
}
