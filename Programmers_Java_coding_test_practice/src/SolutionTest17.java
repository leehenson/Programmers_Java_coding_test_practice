public class SolutionTest17 {
	private String solution(String s) {
		String answer = "";
		
		String[] numbers = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			int number = Integer.parseInt(numbers[i]);
			
			min = Math.min(min, number);
			max = Math.max(max, number);
		}
		answer = min + " " + max;
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest17 s = new SolutionTest17();
		System.out.println(s.solution("1 2 3 4"));
		System.out.println(s.solution("-1 -2 -3 -4"));
		System.out.println(s.solution("-1 -1"));
	}
}