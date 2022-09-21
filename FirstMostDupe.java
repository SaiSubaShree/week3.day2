package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstMostDupe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abbaba";
char[] val = str.toCharArray();
Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
int MaxOccur=0;
char key=0;
for (char c : val) {
	
	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
	}
	else
	{
		map.put(c, 1);
	}
	
}
System.out.println(map);

Set<Entry<Character, Integer>> entrySet = map.entrySet();
for (Entry<Character, Integer> entry : entrySet) {
//entry.getKey();	
//System.out.println(entry.getKey());
	if(entry.getValue()>=MaxOccur)
	{
		key=entry.getKey();
		MaxOccur=entry.getValue();
	}
}
System.out.println("The first most Duplicate number "+ key);
	}

}
