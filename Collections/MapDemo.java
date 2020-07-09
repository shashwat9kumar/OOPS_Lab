import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Shashwat");
		map.put("age", 19);
		map.put("sex", 'M');
		map.put("height", 6.2);
		System.out.println(map);
		
		Set<String> key = map.keySet();
		Collection<Object> value = map.values();
		for(String i : key)
		{
			System.out.println(map.get(i));
		}
		
		for(Object i : value)
		{
			System.out.println();
		}

	}

}
