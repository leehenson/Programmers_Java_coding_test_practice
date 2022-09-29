import java.util.Arrays;

public class SolutionTest15 {
	private int solution(int[] numbers) {
		int sumArr = 0;
		int sumTotal = 0;
		
		for(int i = 0; i < 10; i++) {
			sumTotal += i;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			sumArr += numbers[i];
		}
		
		return sumTotal - sumArr;
	}
	
	public static void main(String[] args) {
		SolutionTest15 s = new SolutionTest15();
		int[] a = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] b = { 5, 8, 4, 0, 6, 7, 9 };
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
	}
}