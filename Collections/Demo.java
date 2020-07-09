import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
//		Object arr[] = new Object[4];
//		
//		arr[0] = "Shashwat";
//		arr[1] = 2;
//		arr[2] = 3.1475;
//		arr[3] = true;
//		
//		
//		for(Object i : arr)
//		{
//			System.out.println(i);
//		}
		
		
		
//		Collection c = new ArrayList();
//		
//		c.add("Shashwat");
//		c.add(1999);
//		c.add(3.14f);
//		c.add('A');
//		c.add(false);
//		
//		
//		Iterator i = c.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		Collection<Integer> values = new ArrayList<Integer>();
//		
//		values.add(2);
//		values.add(33);
//		values.add(22);
//		values.add(new Integer(4));
//		
//		
//		for(int x : values)
//		{
//			System.out.println(x);
//		}
//		values.forEach(System.out::println);
		
		List<Integer> val = new ArrayList<Integer>();
		val.add(2);
		val.add(33);
		val.add(22);
		val.add(0,3);
		val.add(10);
		
		
		System.out.println(val);
		
//		
//		Collections.sort(val);
//		
//		val.forEach(System.out::println);
	}

}
