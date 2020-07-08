import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PolycarpTrainning {
	 public static void main(String[] args) throws IOException {
		    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		    int n = Integer.parseInt(bf.readLine()), numC=0, actN=0;
		    List<Integer> a=Arrays.asList(bf.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		    Collections.sort(a);
		    for(int i = 0; i<a. size();i++){
		      if(a.get(i)>numC){
		        numC++;
		      }
		    }
		    System.out.println(numC);

		  }
}
