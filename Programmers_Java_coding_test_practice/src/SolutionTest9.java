import java.util.*;

public class SolutionTest9 {
	private int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				al.add(arr[i]);
			}
		}
		
		if(al.isEmpty()) {
			al.add(-1);
		}
		
		answer = new int[al.size()];
		
		for(int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest9 s = new SolutionTest9();
		int[] a = { 5, 9, 7, 10 };
		int[] b = { 2, 36, 1, 3 };
		int[] c = { 3, 2, 6 };
		System.out.println(Arrays.toString(s.solution(a, 5)));
		System.out.println(Arrays.toString(s.solution(b, 1)));
		System.out.println(Arrays.toString(s.solution(c, 10)));
	}
}