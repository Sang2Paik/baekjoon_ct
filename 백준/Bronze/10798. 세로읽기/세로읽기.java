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
		

		
		for(int i=0; i<cols; i++) {
			for(int k=0; k<rows; k++) {
				if(array[k].length<=i)
					continue;
				else
					System.out.printf("%c", array[k][i]);
			}
		}
		
	}
}  