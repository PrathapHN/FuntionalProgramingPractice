import java.util.Arrays;
import java.util.List;

public class FCP01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printListofNumberinTraditional(Arrays.asList(12,4,6,1,2,5));
		
		//printListofNumberinFunctionalApproach(Arrays.asList(12,4,6,1,2,5));
		
		//printEvenNumberUsingTraditionalNumber(Arrays.asList(12,4,6,1,2,5));
		
		printEvenNumberUsingFunctionalApproach(Arrays.asList(12,4,6,1,2,5));


		

	}

	private static void printEvenNumberUsingFunctionalApproach(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		//asList.stream().filter(FCP01::checKEven).forEach(System.out::println);
		
		asList.stream().filter(n-> n%2==0).forEach(System.out::println);

		
	}

	private static void printEvenNumberUsingTraditionalNumber(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		for(int num: asList) 
	    if(num%2==0)
	    System.out.println(num);
	
			
		
		
	}

	private static void printListofNumberinFunctionalApproach(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().forEach(FCP01::print);
		
		asList.stream().forEach(System.out::println);
		  
	}

	private static void printListofNumberinTraditional(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		for(int num: asList) {
			
			System.out.println(num);
			
		}
		
	}
	
	public static void print(int n) {
		
		System.out.println(n);
		
	}
	
	public static boolean checKEven(int num) {
		return num%2==0;
		
	}

}
