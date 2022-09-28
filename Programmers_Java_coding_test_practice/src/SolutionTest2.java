import java.util.*;

public class SolutionTest2 {
	private long solution(long n) {
		String[] list = String.valueOf(n).split("");
		Arrays.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(String alist : list) sb.append(alist);
		return Long.parseLong(sb.reverse().toString());
	}
	
	public static void main(String[] args) {
		SolutionTest2 s = new SolutionTest2();
		System.out.println(s.solution(118372));
	}
}