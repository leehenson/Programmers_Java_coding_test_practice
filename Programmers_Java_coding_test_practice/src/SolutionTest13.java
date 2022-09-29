public class SolutionTest13 {
	private String solution(String s) {
		String answer = "";
		int num = s.length();
		int num2 = num / 2;
		
		if(num % 2 == 0) {
			answer = s.substring(num2 - 1, num2 + 1);
		} else {
			answer = s.substring(num2, num2 + 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest13 s = new SolutionTest13();
		System.out.println(s.solution("abcde"));
		System.out.println(s.solution("qwer"));
	}
}