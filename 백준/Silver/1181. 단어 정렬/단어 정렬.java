import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str_n = br.readLine();
		int N = Integer.parseInt(str_n);
		Set<String> word_set = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			
			String word = br.readLine();
			word_set.add(word);
		}
		
		String[] word_array = word_set.toArray(new String[word_set.size()]);
		
		Arrays.sort(word_array, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				
				if (o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length()-o2.length();
			}
		});
		
		for(String word : word_array) {
			
			bw.write(String.format("%s\n", word));
		}
		
				
		bw.flush();
		bw.close();
		br.close();
	}

} 