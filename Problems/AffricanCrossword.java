import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AffricanCrossword {
	static int valRep[][],n,m;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int f=0,col=0,auxF=0;
		StringTokenizer linea=new StringTokenizer(entrada.readLine());
		n=Integer.parseInt(linea.nextToken());
		m=Integer.parseInt(linea.nextToken());
		valRep=new int[n][m] ;
		StringBuilder words=new StringBuilder("");
		List<String> aux = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			words.append(entrada.readLine());
		}
		
		for (int i = 0; i < words.length(); i++) {
			if(auxF>=n) {
				f++;
				auxF=0;
			}
			calcRep(words.charAt(i)+"", words, f, i%m);
			auxF++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(valRep[i][j]);
			}
		}
		
	}
	
	static public void calcRep(String c, StringBuilder word,int f, int col) {
		System.out.println(f+" "+col);
		for (int i = 0; i < n ; i++) {
			if(i==f) continue;
			if(valRep[i][col]==1) {
				valRep[f][col]=1;
				continue;
			}
			else {
				if(c.equals(word.charAt(f+i)+"")) {
					System.out.println(f+i);
					System.out.println(c + " "+word.charAt(f+i));
					valRep[f][col]=1;
					valRep[i][col]=1;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			if(i==col) continue;
			if(valRep[f][i]==1 ) {
				valRep[f][col]=1;
				continue;
			}
			else {
				
				if(c.equals(word.charAt(i)+"")) {
					System.out.println(c+" "+word.charAt(i));
					valRep[f][col]=1;
					valRep[i][col]=1;
				}
			}

		}
	}

}
