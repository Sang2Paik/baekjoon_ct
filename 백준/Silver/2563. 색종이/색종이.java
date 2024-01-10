import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		int [][] allArea = new int[100][100];
		
		for(int i=0; i<num; i++) {
			
			String str = br.readLine();
			String [] xy = str.split(" ");
			int x = Integer.valueOf(xy[0]);
			int y = Integer.valueOf(xy[1]);
			
			//해당 영역에 1로 채워넣기
			for(int k=0; k<10; k++) {
				for(int j=0; j<10; j++) {
					allArea[x+k][y+j]=1;
				}
			}
		}
		
		for(int i=0; i<allArea.length; i++) {
			for(int k=0; k<100 ; k++) {
				if(allArea[i][k] == 1)
					count++;
				if(allArea[i][k] == 0)
					continue;
			}
		}
		System.out.println(count);
	
	}
}  