public class AddDigits {
	int addDigits(int n) {
	    int answer = 0;
	    
	    while(n > 0) {
	        answer += n % 10;
	        n /= 10;
	    }
	    return answer;
	}
	
	public static void main(String[] args) {
		AddDigits addDigits = new AddDigits();
		System.out.println(addDigits.addDigits(123));
	}
}