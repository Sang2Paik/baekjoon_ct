import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str_num = br.readLine();
		String [] str_array = str_num.split(" ");
		int N = Integer.valueOf(str_array[0]);
		int M = Integer.valueOf(str_array[1]);
		int min_gap =M;
		String max="";
		int gap =0;
		int sum = 0;
		int number = 0;
		int [] cr_num_array = new int [N];
		int len = cr_num_array.length;
		
		Map<String, Integer> result = new HashMap<String, Integer>();
		result.put(max, sum);
		
		if(N<3 || N>100) return;
		if(M<10 || M>300000) return;
		
		String cards = br.readLine();
		String [] cards_array = cards.split(" ");
		for(int i=0; i<len; i++) {
			number = Integer.valueOf(cards_array[i]);
			if(number>100000) return;
			cr_num_array[i] = number;
		}
		
		
		for(int i=0; i<len-2; i++) {
			for(int j=i+1; j<len-1; j++) {
				for(int k=j+1; k<len; k++) {
										
					sum = cr_num_array[i]+cr_num_array[j]+cr_num_array[k];
					gap = M-sum;
					
					if(gap>=0 && gap<min_gap ) {
						min_gap = gap;
						result.replace(max, sum);
					}
					
				}
			}	
		}
		
		System.out.println(result.get(max));
	
	}
} 