
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
		
		String str_n = br.readLine();
		int [] num_array = new int [str_n.length()];
		
		for(int i=0; i<str_n.length(); i++) {
			int num = (int) str_n.charAt(i);
			num_array[i] = num;
		}
		
		for(int i=0; i<str_n.length()-1; i++) {
			for(int j=i+1; j<str_n.length(); j++) {
				if(num_array[i]<num_array[j]) {
					int temp = num_array[j];
					num_array[j] = num_array[i];
					num_array[i] = temp;
				}
			}
		}
		
		for(int i=0; i<str_n.length(); i++) {
			bw.write(num_array[i]);
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
} 
 