import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 수의 개수
		String str_n = br.readLine();
		int N = Integer.parseInt(str_n);
		int [] num_array = new int [N];
		
		for(int i=0; i<N; i++) {
			
			String str_num = br.readLine();
			int num = Integer.parseInt(str_num);
			num_array[i] = num;
			
		}
		
		Arrays.sort(num_array);
		
		for(int i=0; i<N; i++) {
			bw.write(String.valueOf(num_array[i]));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}  