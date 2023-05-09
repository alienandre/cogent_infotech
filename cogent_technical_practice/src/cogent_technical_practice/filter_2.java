package cogent_technical_practice;

import java.util.Arrays;

public class filter_2 {
	public static int filter(int[] population){
		Arrays.sort(population);
		int currentSum = sumArray(population);
		int goalSum = currentSum/2;
		int numFilters = 0;
		
		while(currentSum > goalSum) {
			population[population.length-1] = population[population.length-1] / 2;
			Arrays.sort(population);
			currentSum = sumArray(population);
			numFilters++;
		}
		
		return numFilters;
	}
	
	public static int sumArray(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		int[] A = {10,10};
		System.out.print(filter(A));
	}

}
