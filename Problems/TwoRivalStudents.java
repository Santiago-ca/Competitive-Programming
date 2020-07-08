import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoRivalStudents {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader entrada = new BufferedReader(new FileReader("pruebas.txt"));
		String res="";
		int ren=0,numEst,mov,p1,p2,iz,der,distmax;
		int casos = Integer.parseInt(entrada.readLine());
		//String[] linea = new String[4];
		StringTokenizer linea;
		for (int i = 0; i < casos; i++) {
			linea = new StringTokenizer(entrada.readLine()); 
			//System.out.println(linea.countTokens());
			distmax=Integer.parseInt(linea.nextToken())-1;
			mov=Integer.parseInt(linea.nextToken());
			p1=Integer.parseInt(linea.nextToken());
			p2=Integer.parseInt(linea.nextToken());
			
			if(p1< p2) {
				iz=p1;
				der = p2;
			}
			else {
				der=p1;
				iz =p2;
			}
			if((Math.abs(der-distmax+1)) > Math.abs(iz-distmax+1)) {
				while(Math.abs(iz-der)<=distmax) {
					if (mov==0 || Math.abs(iz-der)==distmax) {
						 break;
					}
					if (der==distmax+1) {
						iz--;
						mov--;
					}
					else {
						der++;
						mov--;
					}
					
				}
			}
			else {
				while(Math.abs(iz-der)<=distmax) {
					if (mov==0 || Math.abs(iz-der)==distmax) {
						break;
					}
					if (iz==1) {
						der++;
						mov--;
					}
					else {
						iz--;
						mov--;
					}
					
					//System.out.println(mov);
				}
			}
			System.out.println(Math.abs(iz-der));
		}
	}
	
}
