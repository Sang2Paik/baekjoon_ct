import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		List<Integer> result_list = new ArrayList<Integer>();
		String str_M = "";
		int M=1;
		
		for(int i=1;i<N;i++) {
			
			str_M = String.valueOf(M);
			
			int num_list_sum = 0;
			for(int k=0; k<str_M.length(); k++) {
				num_list_sum += Integer.valueOf(str_M.charAt(k))-48;
			}
			
			if(M + num_list_sum == N) {
				result_list.add(M);
			}
			
			M++;
		}
		
		if(!result_list.isEmpty()) {
			System.out.println(result_list.get(0));
		}if(result_list.isEmpty()) {
			System.out.println(0);
		}
		
		scan.close();
	}
} 