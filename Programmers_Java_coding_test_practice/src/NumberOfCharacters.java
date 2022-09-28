public class NumberOfCharacters {
	private boolean numberOfCharacters(String s) {
		int pCnt = 0, yCnt = 0;
		String[] array = s.toLowerCase().split("");
		
		for(int i = 0; i < array.length; i++) {
			if("p".equals(array[i])) {
				pCnt++;
			} else if("y".equals(array[i]))	{
				yCnt++;
			}
		}
		if(pCnt != yCnt) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		NumberOfCharacters numberOfCharacters = new NumberOfCharacters();
		System.out.println(numberOfCharacters.numberOfCharacters("pPoooyY"));
		System.out.println(numberOfCharacters.numberOfCharacters("Pyy"));
	}
}