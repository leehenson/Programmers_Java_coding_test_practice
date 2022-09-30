public class SolutionTest23 {
	private long soltuion(int price, int money, int count) {
		long answer = 0;
		long sum = 0;
		
		for(int i = 1; i <= count; i++) {
			sum += price * i;
		}
		
		if(sum > money) answer = sum - money;
		else answer = 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest23 s = new SolutionTest23();
		System.out.println(s.soltuion(3, 20, 4));
	}
}