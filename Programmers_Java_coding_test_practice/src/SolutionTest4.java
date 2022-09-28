import java.util.Arrays;

public class SolutionTest4 {
	private long[] solution(int x, int n) {
		long[] arr = new long[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (long)x * (i + 1);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		SolutionTest4 s = new SolutionTest4();
		System.out.println(Arrays.toString(s.solution(2, 5)));
		System.out.println(Arrays.toString(s.solution(4, 3)));
		System.out.println(Arrays.toString(s.solution(-4, 2)));
	}
}