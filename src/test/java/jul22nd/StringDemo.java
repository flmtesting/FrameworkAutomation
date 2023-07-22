package jul22nd;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {

	public static void main(String[] args) {
		
		
		findNoOfeachCharacterInString("Has been developed with known defects");
		
		findNoOfeachCharacterInString("malayalam");

	}

	private static void findNoOfeachCharacterInString(String str) {
		
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		char[] allChars=str.toCharArray();
		
		for(int i=0;i<allChars.length;i++)
		{
			
			if(hMap.containsKey(allChars[i]))
			{
				hMap.put(allChars[i], hMap.get(allChars[i])+1);
			}
			else
			{
				hMap.put(allChars[i], 1);
			}
			
		}
		
		System.out.println(hMap);
		
		System.out.println(hMap.get('e'));
		
	}

}
