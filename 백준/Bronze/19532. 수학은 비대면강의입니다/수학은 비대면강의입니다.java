import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_num = br.readLine();

		StringTokenizer st = new StringTokenizer(str_num, " ");
		
		double a= Double.parseDouble(st.nextToken());
		double b= Double.parseDouble(st.nextToken());
		double c= Double.parseDouble(st.nextToken());
		double d= Double.parseDouble(st.nextToken());
		double e= Double.parseDouble(st.nextToken());
		double f= Double.parseDouble(st.nextToken());
		int x = -999;
		int y = -999;
		
		if(a<-999 || a>999 || b<-999 || b>999 || c<-999 || c>999 || d<-999 || d>999
			|| e<-999 || e>999 || f<-999 || f>999) return;
			
		for(int i=x; i<=999; i++) {
			for(int k=y; k<=999; k++) {
				if((a*i)+(b*k)==c && (d*i)+(e*k)==f) {
					x=i;
					y=k;
					break;
				}
			}
		}
				
		System.out.printf("%d %d", x, y);	
	}
} 