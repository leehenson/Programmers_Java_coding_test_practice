public class SolutionTest12 {
	private int solution(int hp) {
		int answer = 0;
		
		while(hp != 0) {
			if(hp > 4) {
				hp -= 5;
				answer++;
			} else if(hp > 2) {
				hp -= 3;
				answer++;
			} else {
				hp -= 1;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest12 s = new SolutionTest12();
		System.out.println(s.solution(23));
		System.out.println(s.solution(24));
		System.out.println(s.solution(999));
	}
}