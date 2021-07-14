import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FCP07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSortedArray(Arrays.asList("API", "S","Spring Boot","Spring", "Micro services","AWS","PCF","Azure","Dockers","Kubernete"));
		

	}

	private static void printSortedArray(List<String> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().sorted().forEach(System.out::println);
		
		System.out.println(" **************************************");
		
		asList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		System.out.println(" **************************************");
		
		asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println(" **************************************");

		asList.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);


		
	}

}
