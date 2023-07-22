package jul22nd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		//add key value to Map
		
		hMap.put("Manager", "Ravi");
		
		hMap.put("Team Lead", "Sam");
		
		hMap.put("Business Analyst", "Gopi");
		
		
		
		// method 2 using Entry (I)
		
		Set<Entry<String, String>> entries=hMap.entrySet();
		
		for(Entry<String, String> temp:entries)
		{
			System.out.println(temp.getKey()+"----"+temp.getValue());
		}
		
		

	}

}
