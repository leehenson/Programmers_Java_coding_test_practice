public class SolutionTest6 {
	private long solution(int a, int b) {
		int sum = 0;
		
		if(a <= b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SolutionTest6 s = new SolutionTest6();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}
}