import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str_n = br.readLine();
		int N = Integer.parseInt(str_n);
		int [][] x_y_array = new int [N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x_y_array[i][0] = Integer.parseInt(st.nextToken());		
			x_y_array[i][1] = Integer.parseInt(st.nextToken());		
		}
		
		Arrays.sort(x_y_array, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]==o2[0]? o1[1]-o2[1] : o1[0]-o2[0];
			}
				
		});
				
		for(int i=0; i<N; i++) {
			bw.write(String.format("%d %d\n", x_y_array[i][0], x_y_array[i][1]));	
		}
				
		bw.flush();
		bw.close();
		br.close();
	}
}  