public class SolutionTest5 {
	private int solution(int n) {
		int x = 1;
		
		while(n % x != 1) {
			if(n % x == 1) {
				return x;
			}
			x++;
		}
		return x;
	}
	
	public static void main(String[] args) {
		SolutionTest5 s = new SolutionTest5();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
	}
}