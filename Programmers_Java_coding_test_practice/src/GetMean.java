public class GetMean {
	public double getMean(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];            
        }

        return (double)sum / arr.length;
    }
	
	public static void main(String[] args) {
		int[] x = { 5, 4, 3 };
		GetMean getMean = new GetMean();
		
		System.out.println("평균값 : " + getMean.getMean(x));
	}
}