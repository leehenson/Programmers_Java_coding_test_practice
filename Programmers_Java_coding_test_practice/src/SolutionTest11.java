public class SolutionTest11 {
	private int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < signs.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest11 s = new SolutionTest11();
		int[] a = { 4, 7, 12 };
		int[] b = { 1, 2, 3 };
		boolean[] c = { true, false, true };
		boolean[] d = { false, false, true };
		System.out.println(s.solution(a, c));
		System.out.println(s.solution(b, d));
	}
}