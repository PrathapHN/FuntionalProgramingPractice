import java.util.Arrays;
import java.util.List;

public class FCP02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printOddNumberfromTheList(Arrays.asList(12,4,6,1,2,5));
		
		printCoursesAsIndidually(Arrays.asList("API", "Spring Boot","Spring", "Micro services","AWS","PCF","Azure","Dockers","Kubernete"));

	}

	private static void printCoursesAsIndidually(List<String> asList) {
		// TODO Auto-generated method stub
		
		//asList.stream().forEach(System.out::println);
		
		asList.stream().filter(s->s.startsWith("Spring")).forEach(System.out::println);

		asList.stream().filter(s->s.length()>=4).forEach(System.out::println);

		
		
	}

	private static void printOddNumberfromTheList(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		asList.stream().filter(x -> !(x%2==0)).forEach(System.out::println);
		
		
	}

}
