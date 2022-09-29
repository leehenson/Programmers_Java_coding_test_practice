public class SolutionTest8 {
	private String solution(String phone_number) {
		String answer = "";
		
		for(int i = 0; i < phone_number.length(); i++) {
			if(i < phone_number.length() - 4) {
				answer += "*";
			} else {
				answer += phone_number.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest8 s = new SolutionTest8();
		System.out.println(s.solution("01033334444"));
		System.out.println(s.solution("027778888"));
	}
}