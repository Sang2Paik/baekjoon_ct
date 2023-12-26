import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int rows = 5;
		int cols = 0;
		boolean bCheck = true;
		
		char [][] array = new char [rows][];
		
		for(int i=0; i<rows; i++) {
			String str = bf.readLine();
			
			array[i] = new char[str.length()];
			
			for(int j=0; j<str.length(); j++) {		
				array[i][j] = str.charAt(j);
				
				cols = cols > str.length() ? cols: str.length();
				
				if (array[i][j] >= 0 && array[i][j] <= 9 || array[i][j] >= 'A' && array[i][j] <= 'Z'
						|| array[i][j] >= 'a' && array[i][j] <= 'z') {
					bCheck = true;
				} else
					bCheck = false;
				
				if(bCheck = false) return;
			}
	
		}
		
		char [][] new_array = new char[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int k=0; k<cols; k++) {
				
				if(array[i].length<=k) 
					new_array[i][k] = '\0';
				else
				new_array[i][k] = array[i][k];
			}
		}
		
		
		for(int i=0; i<cols; i++) {
			for(int k=0; k<rows; k++) {
				if(new_array[k][i] == '\0')
					continue;
				else
					System.out.printf("%c", new_array[k][i]);
			}
		}
		
	}
} 