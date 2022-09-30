import java.util.Arrays;

public class SolutionTest22 {
	private int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = arr1;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] += arr2[i][j]; 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		SolutionTest22 s = new SolutionTest22();
		int[][] arr1 = { {1, 2}, {2, 3} };
		int[][] arr2 = { {3, 4}, {5, 6} };
		int[][] arr3 = { {1}, {2} };
		int[][] arr4 = { {3}, {4} };
		System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
		System.out.println(Arrays.deepToString(s.solution(arr3, arr4)));
	}
}