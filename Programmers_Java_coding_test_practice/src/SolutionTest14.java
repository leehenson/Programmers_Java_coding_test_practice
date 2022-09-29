public class SolutionTest14 {
	private String solution(int n) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				sb.append("박");
			} else {
				sb.append("수");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SolutionTest14 s = new SolutionTest14();
		System.out.println(s.solution(3));
		System.out.println(s.solution(4));
	}
}