import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int num = 0;
		List<Integer> num_array = new ArrayList<Integer>();
	
		
		for(int i=0; i<N; i++) {
			
			num = scan.nextInt();
			num_array.add(num);		
			
		}
		
		Collections.sort(num_array);
		
		for(int i=0; i<num_array.size()-1;i++) {
			if(num_array.get(i)==num_array.get(i+1))
				num_array.remove(i);
		}
		
		for(int number : num_array) {
			System.out.println(number);
		}
		
		

	}
} 