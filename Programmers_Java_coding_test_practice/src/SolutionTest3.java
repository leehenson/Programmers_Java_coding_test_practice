public class SolutionTest3 {
	private int Solution(String s) {
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		SolutionTest3 s = new SolutionTest3();
		System.out.println(s.Solution("1234"));
		System.out.println(s.Solution("-1234"));
	}
}