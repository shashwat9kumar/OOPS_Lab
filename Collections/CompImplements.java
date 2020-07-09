import java.util.Comparator;

public class CompImplements implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1%10>o2%10?-1:1;
		
	}

}
