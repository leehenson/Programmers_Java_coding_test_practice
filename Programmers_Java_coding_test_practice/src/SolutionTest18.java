import java.util.Arrays;

public class SolutionTest18 {
	private String solution(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length));
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		SolutionTest18 s = new SolutionTest18();
		System.out.println(s.solution("Zbcdefg"));
	}
}