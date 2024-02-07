import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pp_num = br.readLine();
		String[] pp_num_array = pp_num.split(" ");
		//응시자 수 
		int N = Integer.parseInt(pp_num_array[0]);
		//상을 사람 받는 수
		int k = Integer.parseInt(pp_num_array[1]);
		
		// 학생 점수
		String x = br.readLine();
		String[] x_array = x.split(" ");
		int [] x_num_array = new int[N];
		
		for(int i=0; i<x_array.length; i++) {
			x_num_array[i] = Integer.parseInt(x_array[i]);			
		}
		
		for(int i=0; i<x_num_array.length-1; i++) {
			for(int j=i+1; j<x_num_array.length; j++) {
				if(x_num_array[i]<x_num_array[j]) {
					int temp = x_num_array[i];
					x_num_array[i] = x_num_array[j];
					x_num_array[j] = temp;
				}	
			}
		}// end for sorting
		
		
		System.out.println(x_num_array[k-1]);
		
		
	}
} 