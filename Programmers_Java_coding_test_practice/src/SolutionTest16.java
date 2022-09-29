public class SolutionTest16 {
	private int solution(int[] a, int[] b) {
		int answer = 0;
		
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest16 s = new SolutionTest16();
		int[] a1 = { 1, 2, 3, 4 };
		int[] b1 = { -3, -1, 0, 2 };
		int[] a2 = { -1, 0, 1 };
		int[] b2 = { 1, 0, -1 };
		System.out.println(s.solution(a1, b1));
		System.out.println(s.solution(a2, b2));
	}
}