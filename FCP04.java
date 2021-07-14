import java.util.Arrays;
import java.util.List;

public class FCP04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int sum=printOddNumberfromTheListTraditional(Arrays.asList(12,4,6,1,2,5));

		//System.out.println(" summ : "+sum);
		
		//int sum1=printOddNumberfromTheListFunctionalApproach(Arrays.asList(12,4,6,1,2,5));

		//System.out.println(" summ 1: "+sum1);
		
		//int sum1=TestFunctionalPogram(Arrays.asList(12,4,6,1,2,5));

		//int sum1=TestFunctionalPogram2(Arrays.asList(12,4,6,1,2,5));
		
		int sum2=TestFunctionalPogram3(Arrays.asList(12,4,6,1,2,5));
		
		System.out.println(" sum2 : "+sum2);

		
		



	}

	private static int TestFunctionalPogram3(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		// Max number
		
		
		return asList.stream().reduce(Integer.MAX_VALUE,(x,y)-> x>y?y:x);
	}

	private static int TestFunctionalPogram2(List<Integer> asList) {
		// TODO Auto-generated method stub
		int returncheck=asList.stream().reduce(0, (x,y)->x);
		System.out.println("  returncheck : "+returncheck);
		return 0;
	}

	private static int TestFunctionalPogram(List<Integer> asList) {
		// TODO Auto-generated method stub
		 asList.stream().reduce(0, FCP04::sum);
		return 0;
	}

	private static int printOddNumberfromTheListFunctionalApproach(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		return asList.stream().reduce(0,(a,b)->(a+b));
		 
	}

	private static int printOddNumberfromTheListTraditional(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i:asList ) {
			sum+=i;
		}
		return sum;
		
		
	}
	
	private static int sum(int aggregator, int nextNumber) {
		System.out.println(" aggregator :  "+aggregator +"nextNumber :" +nextNumber);
		return aggregator+nextNumber;
		
	}

}
