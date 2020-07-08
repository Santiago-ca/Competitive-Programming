import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Candy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));

		long dprow[],dpcol[],row[];int m,n;
		//int num = Integer.parseInt(entrada.readLine());
		StringTokenizer linea;
		String oo,split[];
		
		

		while(!(oo=entrada.readLine()).equals("0 0")) {
			split=oo.split(" ");
			m=Integer.parseInt(split[0]);n=Integer.parseInt(split[1]);
			dprow=new long[n];dpcol=new long[m];row=new long[n];
			for (int i = 0; i <m ; i++) {
				//linea= new StringTokenizer(entrada.readLine());
				split = entrada.readLine().split(" ");
				for (int j = 0; j <n ; j++) {
					row[j]=Long.parseLong(split[j]);
					//System.out.println(row[j]);
				}
				for (int k = 0; k < dprow.length; k++) {
					if(k<2) dprow[k]=row[k];    
					else if(k==2) dprow[k]=dprow[0]+row[k];
					else dprow[k]=Math.max(dprow[k-3], dprow[k-2])+row[k];
				}
				if (dprow.length==1) dpcol[i]=dprow[0];
				else dpcol[i]=Math.max(dprow[dprow.length-1], dprow[dprow.length-2]);
				//System.out.println(dprow[dprow.length-1]+" "+ dprow[dprow.length-2]);
			}
			dprow=new long[dpcol.length];
			for (int i = 0; i < dpcol.length; i++) {
				if(i<2) dprow[i]=dpcol[i];
				else if(i==2) dprow[i]=dprow[0]+dpcol[i];
				else dprow[i]=Math.max(dprow[i-3], dprow[i-2])+dpcol[i];
			
			}
			System.out.println(dprow.length==1?dprow[0]:Math.max(dprow[dprow.length-1], dprow[dprow.length-2]));
		}
		
		
	}
}
