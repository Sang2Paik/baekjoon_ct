import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int num = 0;
		boolean bCheck = false;
		//행, 열 선언
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		if(rows<=100 && cols<=100)
			bCheck = true;
		else 
			bCheck = false;
		
		//2차 배열 만들기
		int [][] array1 = new int[rows][cols];
		int [][] array2 = new int[rows][cols];
		int [][] result = new int[rows][cols];
		
		//for문 돌려서 array1에 숫자 넣기
		for(int i=0; i<rows ; i++) {
			for(int k=0; k<cols; k++) {
				num = scan.nextInt();
				
				if(Math.abs(num)<=100)
					bCheck=true;
				else
					bCheck=false;
				
				array1[i][k] = num;	
			}
		}
		
		
		
		//for문 돌려서 array2에 숫자 넣기
		for(int i=0; i<rows ; i++) {
			for(int k=0; k<cols; k++) {
				num = scan.nextInt();
				
				if(Math.abs(num)<=100)
					bCheck=true;
				else
					bCheck=false;
				
				array2[i][k] = num;	
			}
		}
		
		if(bCheck=false) return;
		
		//array1과 array2의 숫자 더하기
		for(int i=0; i<rows ; i++) {
			for(int k=0; k<cols; k++) {
				num = array1[i][k] + array2[i][k];
				result[i][k] = num;
			}
		}
		
		for(int i=0; i<rows ; i++) {
			for(int k=0; k<cols; k++) {
				System.out.printf("%d ",result[i][k]);
			}
			System.out.println();
		}
		
	}
} 