package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] val= {2,3,5,6,3,2,1,4,2,1,6,-1};
Map <Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
int MaxOccur=0;
int Key=0;
for (int i : val) {
	if(map.containsKey(i))
	{
		map.put(i,(map.get(i)+1));
	}
	else
	{
		map.put(i, 1);
	}
}
		
System.out.println(map);
Set<Entry<Integer, Integer>> entrySet = map.entrySet();
for (Entry<Integer, Integer> entry : entrySet) {
	
	if(entry.getValue()>MaxOccur)
	{
		Key=entry.getKey();
		MaxOccur=entry.getValue();
	}
}
System.out.println("The maximum interger in the array " + Key +" and its occurance "+MaxOccur);
	}

}

