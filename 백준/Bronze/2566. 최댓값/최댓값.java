import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int rows = 9;
		int cols = 9;
		int token = 0;
		int max = 0;
		int max_i = 0;
		int max_k = 0;
		boolean bCheck =true;
		
		//배열
		int [][] array = new int [rows][cols];
		
		//1행에 문자열로 숫자를 받아 token화	
		for(int i=0; i<rows; i++) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			for(int k=0; k<cols; k++) {
				token = Integer.parseInt(st.nextToken(" "));
				array[i][k] = token;
				
				if(token>=0 && token<100)
					bCheck = true;
				else {
					bCheck = false;
					return;
				}
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int k=0; k<cols; k++) {
				max = max > array[i][k]? max : array[i][k];			
				
				if(array[i][k] == max) {
					max_i = i;
					max_k = k;
				}
					
			}
		}
		
		System.out.println(max);
		System.out.printf("%d %d", max_i+1, max_k+1);
		
	}
} 