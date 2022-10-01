import java.util.Arrays;

public class SolutionTest25 {
	private int[] solution(int n, int m) {
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
		while(min != 0) {
			int r = max % min;
			max = min;
			min = r;
		}
		
		int gcd = n * m / max;
		
		int[] answer = { max, gcd };
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest25 s = new SolutionTest25();
		System.out.println(Arrays.toString( s.solution(3, 12)));
		System.out.println(Arrays.toString( s.solution(2, 5)));
	}
}