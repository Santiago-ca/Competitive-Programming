import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MulticoloredMarbles {
	static long[] fib = new long[1000002];
	static long[] sm = new long[1000001];
	static long[] dp= new long[1000001];
	static long[] dp2=new long[1000001];
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		long n=Integer.parseInt(entrada.readLine());
		System.out.println(calcSM(n)%1000000007);
	}
	
	public static long calcFib(long i) {
		fib[0]=0;
		fib[1]=1;
		for (int j = 2; j <= i; j++) {
			fib[j]=(fib[j-1]+fib[j-2])%1000000007;
		}
		return fib[(int) i];
		
	}
	
	public static long calcSM(long i) {
		sm[0]=0;
		sm[1]=1;
		calcFib(i+1);
		for (int j = 2; j <= i; j++) {
			sm[j]=(sm[j-1]+fib[j+1])%1000000007;
		}
		return sm[(int) i];
	}

}
