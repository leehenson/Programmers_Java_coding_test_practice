public class SquareRoot {
	private long squreRoot(long n) {
		if(Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long)Math.pow((int)Math.sqrt(n) + 1, 2);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		SquareRoot squareRoot = new SquareRoot();
		
		System.out.println(squareRoot.squreRoot(121));
	}
}