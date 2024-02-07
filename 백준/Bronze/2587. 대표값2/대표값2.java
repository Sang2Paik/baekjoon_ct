import java.util.*;

public class Main {
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		int [] num_array = new int [5];
		int sum=0;
		for(int i=0; i<5; i++) {
			
			int num = scan.nextInt();
			num_array[i] = num;
			sum += num_array[i];			
		}
		
		
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5 ; j++) {
				if(num_array[i]>num_array[j]) {
					int temp = num_array[i];
					num_array[i]= num_array[j];
					num_array[j]= temp;
				}
			}
		}// end for
		
		System.out.println(sum/5);
		System.out.println(num_array[2]);
	}
} 