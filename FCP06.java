import java.util.Arrays;
import java.util.List;

public class FCP06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDistinctNumber(Arrays.asList(4,5,1,5,12,3,5,6,3));
		
		System.out.print(" ************************************");
		
		printSortedNumber(Arrays.asList(4,5,1,5,12,3,5,6,3));
		
		System.out.print(" ************************************");

		printDistinctSortedNumber(Arrays.asList(4,5,1,5,12,3,5,6,3));


		

	}

	private static void printDistinctSortedNumber(List<Integer> asList) {
		// TODO Auto-generated method stub
		asList.stream().distinct().sorted().forEach(System.out::println);
		
	}

	private static void printSortedNumber(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().sorted().forEach(System.out::println);
		
	}

	private static void printDistinctNumber(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().distinct().forEach(System.out::println);
	
	}

}
