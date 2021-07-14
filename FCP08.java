import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FCP08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbersInSorted(Arrays.asList(3,1,5,4,12,7,8));

	}

	private static void printNumbersInSorted(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().sorted().forEach(System.out::println);
		
		System.out.println("**************************************");
		
		asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		
	}

}
