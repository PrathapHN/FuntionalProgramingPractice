import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FCP09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=prinntDoubleNumberList(Arrays.asList(3,1,5,4,12,7,8));

		for(int num :list) {
			
			System.out.println(num);
		}

	}

	private static List<Integer> prinntDoubleNumberList(List<Integer> asList) {
		// TODO Auto-generated method stub
		
		
		return asList.stream().map(x->x*x).collect(Collectors.toList());

	}

}
