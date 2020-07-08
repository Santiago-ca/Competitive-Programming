import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleOfStudents {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int n, casos = Integer.parseInt(entrada.readLine());
		StringBuilder auxR, auxL,num;
		String word = "";
		for (int i = 0; i < casos; i++) {
			n = Integer.parseInt(entrada.readLine());
			if (n==1){
				System.out.println("YES");
				entrada.readLine();
				continue;
			}
			
			num = new StringBuilder(entrada.readLine());
			num.append(" "+num);word = num.toString();
			auxR=genRight(n);auxL=genLeft(n);
			System.out.println((word.contains(auxR)||(word.contains(auxL)))?"YES":"NO");
		}
	}
	
	public static StringBuilder genRight(int n) {
		StringBuilder right = new StringBuilder("");
		for (int i = 1; i <= n; i++) {
			if(i==n) right.append(Integer.toString(i));
			else right.append(Integer.toString(i)+" ");
		}
		return right;
	}
	
	public static StringBuilder genLeft(int n) {
		StringBuilder left = new StringBuilder("");
		for (int i = n; i >=1; i--) {
			if(i==1) left.append(Integer.toString(i));
			else left.append(Integer.toString(i)+" ");
		}
		return left;
	}

}
