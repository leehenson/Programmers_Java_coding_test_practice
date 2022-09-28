public class SolutionTest1 {
	private boolean solution(int x) {
		int sum = 0;
		int num = x;
		
		while(num >= 1) {
			sum += num % 10;
			num /= 10;
		}
		if(x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		SolutionTest1 s = new SolutionTest1();
		System.out.println(s.solution(10));
		System.out.println(s.solution(11));
		System.out.println(s.solution(12));
		System.out.println(s.solution(13));
	}
}