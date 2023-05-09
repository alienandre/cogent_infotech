package cogent_technical_practice;

public class minstart_4 {
	public static int minStart(int[] arr) {
		int minVal;
		int maxMinVal=1;
		int sum;
		//Setting starting values for minimum val and running sum
		if(arr[0] > 0) {
			minVal=0;
			sum=arr[0];
		}
		else {
			minVal=arr[0]*-1+1;
			sum=0;
		}
		
		//Iterating through array, tracking a running sum and adding to minVal when running sum drops below 1
		for(int i=1;i<arr.length;i++) {
			sum += arr[i];
			while(sum < 1) {
				minVal = 1-sum;
				sum+=minVal;
			}
			if(minVal > maxMinVal) {
				maxMinVal = minVal;
			}
		}
		return maxMinVal;
	}
	
	public static void main(String[] args) {
		int[] arr = {-4,3,2-1};
		
		System.out.println(minStart(arr));
	}

}
