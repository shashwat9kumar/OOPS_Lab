import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparator {

	
	public static void main(String X[])
	{
		
		List<Integer> val = new ArrayList<Integer>();
		val.add(245);
		val.add(330);
		val.add(229);
		val.add(982);
		val.add(108);
//		
//		Comparator<Integer> obj = (Integer o1, Integer o2) ->
//					{
//				
//								return o1%10>o2%10?1:-1;
//					};
		
		Collections.sort(val,    
			(Integer o1, Integer o2) ->
			 	{
					return o1%10>o2%10?1:-1;
			 	});
		
		val.forEach(System.out::println);
		
		
	}
}
