public class SolutionTest7 {
	private String solution(String[] seoul) {
		int index = 0;
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
	            index = i;
	            break;
            }
        }
        return "김서방은 "+ index +"에 있다";
	}
	
	public static void main(String[] args) {
		String[] strArr = { "Jane", "Kim" };
		
		SolutionTest7 s = new SolutionTest7();
		System.out.println(s.solution(strArr));
	}
}