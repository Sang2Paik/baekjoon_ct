import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(N < 8 || 50 < N || M < 8 || M > 50) return;
		
		int [][] board = new int[N][M];
		int toggle = 1;
		
		for(int i=0; i<N; i++) {
			String bStr = br.readLine();
			
			for(int k=0; k<M; k++) {
				if(bStr.charAt(k)=='W') toggle = 1;
				else toggle = -1;
				
				board[i][k] = toggle;
			}
		}
		
		int min = 2500;
		int result = 0;
		for(int startX=0; startX<N-7; startX++) {
			for(int startY=0; startY<M-7; startY++) {
				
				result = compChess(startX, startY, board);
				min = min>result ? result : min;

			}
		}
		
		System.out.print(min);


	}

	public static int compChess(int startX, int startY, int[][] board) {
		// TODO Auto-generated method stub
		
		int checkNum1 = 1;
		int checkNum2 = -1;
		int result = 0;
		int count1 = 0;
		int count2 = 0;

	
		//체스판 (8*8)로 잘라서 값 비교하기
		//첫값이 1인경우
		for(int i=startX; i<startX+8; i++) {
			for(int k=startY; k<startY+8; k++) {
				
				if(board[i][k] != checkNum1) 
						count1++;

				checkNum1 = -checkNum1;
			}
			checkNum1 = -checkNum1;
		}

		//첫값이 -1인경우
		for(int i=startX; i<startX+8; i++) {
			for(int k=startY; k<startY+8; k++) {
				
				if(board[i][k] != checkNum2) 
					count2++;
				checkNum2 = -checkNum2;	
			}
			checkNum2 = -checkNum2;
		}

		result = count1 > count2? count2: count1;
		
		return result;
	}
} 