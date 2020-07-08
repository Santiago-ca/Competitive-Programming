import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BerOSFileSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder word = new StringBuilder(entrada.readLine()), res=new StringBuilder("/");
		int posAct=1;
		for (int i = posAct ; i<word.length() ; i++) {
			if((word.charAt(i)+"").equals("/")) {
				if(!((word.charAt(i-1)+"").equals("/"))) res.append("/");
			}
			else res.append(word.charAt(i));
		}
		if ((res.charAt(res.length()-1)+"").equals("/")&&res.length()>1) res.deleteCharAt(res.length()-1);
		System.out.println(res);
	}

}
