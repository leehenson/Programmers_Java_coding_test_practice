public class SolutionTest21 {
	private int solution(int left, int right) {
		int answer = 0;
		
		for(int i = left; i <= right; i++) {
			int cnt = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) cnt++;
			}
			
			if(cnt % 2 == 0) answer += i;
			else answer -= i;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest21 s = new SolutionTest21();
		System.out.println((s.solution(13, 17)));
		System.out.println((s.solution(24, 27)));
	}
}