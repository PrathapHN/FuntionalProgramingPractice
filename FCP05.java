import java.util.Arrays;
import java.util.List;

public class FCP05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int sum=findTheSumOfSquares(Arrays.asList(12,4,6,1,2,5));
		  
		  System.out.println(" sum : "+sum);
		  
		  int sum2=findTheSumOfCubes(Arrays.asList(12,4,6,1,2,5));
		  
		  System.out.println(" sum2 : "+sum2);
		  
		  int sum3=findTheSumOfOddNumbers(Arrays.asList(12,4,6,1,2,5));
		  
		  System.out.println(" sum3 : "+sum3);

		  


		
	}

	private static int findTheSumOfOddNumbers(List<Integer> asList) {
		// TODO Auto-generated method stub
		return asList.stream().filter(x->x%2!=0).reduce(0, (x,y)->x+y);
	}

	private static int findTheSumOfCubes(List<Integer> asList) {
		// TODO Auto-generated method stub
		return asList.stream().map(x->x*x*x).reduce(0,(x,y)->x+y);
	}

	private static int findTheSumOfSquares(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		return asList.stream().map(x->x*x).reduce(0,(x,y)->x+y);
	}

}
