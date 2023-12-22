import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws Exception {
		
		double score = 0.0;
		double temp = 0.0;
		double total = 0.0;
		double total_score = 0.0;
		double avg = 0.0;
		int count = 0;
		
		String lecture_name = " ";
		List<String> lecture_name_list = new ArrayList<String>();
		
		boolean bCheck=true;
		
		String grade = " ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> grade_avg = new TreeMap<String, Double>();		
		
		grade_avg.put("A+", (double) 4.5);
		grade_avg.put("A0", (double) 4.0);
		grade_avg.put("B+", (double) 3.5);
		grade_avg.put("B0", (double) 3.0);
		grade_avg.put("C+", (double) 2.5);
		grade_avg.put("C0", (double) 2.0);
		grade_avg.put("D+", (double) 1.5);
		grade_avg.put("D0", (double) 1.0);
		grade_avg.put("F", (double) 0.0);
		
		List<Double> score_list = new ArrayList<Double>();
		score_list.add(1.0);
		score_list.add(2.0);
		score_list.add(3.0);
		score_list.add(4.0);
		
		for(int i=0; i<20; i++) {
			
			String lecture = br.readLine();

			String [] lecture_list = lecture.split(" ");
			
			lecture_name = lecture_list[0];
			
			//과목명 1~50
			if(lecture_name.length()>=1 && lecture_name.length()<=50) 
				bCheck = true;
			else 
				bCheck = false;
			
			//과목명 알파벳 대소문자 & 숫자
			for(int k=0; k<lecture_name.length(); k++) {
				if(lecture_name.charAt(k)>= 0 && lecture_name.charAt(k) <= 9
					|| lecture_name.charAt(k)>='A' && lecture_name.charAt(k) <= 'Z'
					|| lecture_name.charAt(k)>= 'a'&& lecture_name.charAt(k) <= 'z')
					bCheck = true;
				else 
					bCheck = false;
			}
				
			//같은 과목명 있는지 체크
			if(lecture_name_list.contains(lecture_name)) {
				bCheck = false;
				lecture_name_list.add(lecture_name);
			}
						
			score = Double.parseDouble(lecture_list[1]);
			if(score_list.contains(score)) {
				bCheck = true;
			}else {
				bCheck = false;
			}
	
			grade = lecture_list[2];
			
			if(grade_avg.keySet().contains(grade))
				bCheck = true;
			else
				bCheck = false;

			//등급이 P 이면 제외 
			if(grade.equalsIgnoreCase("P")) {
				count++;
				continue;
			}
			
			if(count > 2)
				bCheck = false;
			
			if(bCheck = false) return;
			
			temp = score*grade_avg.get(lecture_list[2]);
			total += temp;
			total_score += score; 
			
		}
		avg= total/total_score;
		System.out.println(avg);		

	}
} 