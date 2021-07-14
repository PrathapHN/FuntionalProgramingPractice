import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FCP10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=printEvenNumber(Arrays.asList(3,1,5,4,12,7,8));
		
		System.out.println(" list : "+list);
		
		System.out.println("************************************** ");
		
	 
		List<Integer> list2=pritnCourseLength(Arrays.asList("API", "S","Spring Boot","Spring", "Micro services","AWS","PCF","Azure","Dockers","Kubernete"));
  
		System.out.println(" list2 : "+list2);

        
		
		

	}

	private static List<Integer> pritnCourseLength(List<String> asList) {
		// TODO Auto-generated method stub
		return asList.stream().map(str->str.length()).collect(Collectors.toList());

	}

	private static List<Integer> printEvenNumber(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		return asList.stream().filter(x->x%2!=0).collect(Collectors.toList());
		
	}

}
