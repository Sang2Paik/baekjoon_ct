import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_num = br.readLine();

		StringTokenizer st = new StringTokenizer(str_num, " ");
		
		int N= Integer.parseInt(st.nextToken());
		String result = "";
		int start = 666;
		
		while(N>0) {
			
			String str_start = String.valueOf(start);
			for(int k=0; k<str_start.length()-2; k++) {
				if(str_start.charAt(k) == '6' && str_start.charAt(k+1) == '6' && str_start.charAt(k+2) == '6') {
					result = str_start;
					N--;
					break;
				}else {
					continue;	
				}	
			}
			start++;			
		}
		
		System.out.println(result);
			
	}
} 