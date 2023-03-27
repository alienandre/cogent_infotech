
public class CalcAverage {
	public static double avgFirstN(int N) throws IllegalArgumentException{
		int sum=0;
		int avg=0;
		if(N > 0) {
			for(int i=1; i<=N; i++) {
				sum+=i;
			}
			avg = sum/N;
			return avg;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(CalcAverage.avgFirstN(-1));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Must enter natural number");
		}

	}
	
}
