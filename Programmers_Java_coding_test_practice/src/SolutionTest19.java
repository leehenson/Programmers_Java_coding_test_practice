public class SolutionTest19 {
	private boolean solution(String s) {
		if(s.length() != 4 && s.length() != 6) return false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		SolutionTest19 s = new SolutionTest19();
		System.out.println(s.solution("a234"));
		System.out.println(s.solution("1234"));
	}
}