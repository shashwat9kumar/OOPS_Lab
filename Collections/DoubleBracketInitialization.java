import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBracketInitialization {

	public static void main(String[] args)
	{
		List<Integer> arr = Arrays.asList(2,4,6,8);
		
		List<Integer> values = new ArrayList<Integer>()
		{ // Anonymous Inner Class
			{ // Instantiation Initializers
				
				add(2);
				add(3);
				add(4);
				add(5);				
			}
		};
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}

}
