import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class BooksExchange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int q=Integer.parseInt(entrada.readLine()),n,pAct;
		String p[],res[];
		TreeMap<Integer, Integer> dias = new TreeMap<Integer, Integer>();
		boolean visit[];
		for (int i = 0; i < q; i++) {
			dias.clear();
			n=Integer.parseInt(entrada.readLine());
			p=entrada.readLine().split(" ");
			res=new String[n];
			for (int j = 0; j < p.length; j++) {
				pAct=Integer.parseInt(p[j])-1;
				for (int j2 = 0; true; j2++) {
					if(j==pAct) {
						res[j]=(j2+1)+"";
						break;
					}
					else pAct=Integer.parseInt(p[pAct])-1;
				}
			}
			System.out.println(Arrays.toString(res).replace("[", "").replace("]", "").replace(",", ""));
		}
	}

}
