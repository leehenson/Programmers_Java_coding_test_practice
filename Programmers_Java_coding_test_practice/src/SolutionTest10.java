import java.util.Arrays;

public class SolutionTest10 {
	private int[] solution(int[] arr) {
		if(arr.length == 1) return new int[] { -1 };
		
		int min = Integer.MAX_VALUE;
		for(int a : arr) if(min > a) min = a;
		
		int[] answer = new int[arr.length - 1];
		int index = 0;
		for(int a : arr) if(min != a) answer[index++] = a;
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest10 s = new SolutionTest10();
		int[] a = { 4, 3, 2, 1 };
		int[] b = {10};
		System.out.println(Arrays.toString(s.solution(a)));
		System.out.println(Arrays.toString(s.solution(b)));
	}
}