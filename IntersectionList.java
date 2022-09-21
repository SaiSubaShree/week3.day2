package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] FirstArray= {1,4,6,7,8};
int[] SecondArray= {2,1,7,5,3};
List<Integer> L1= new ArrayList<Integer> ();
for (Integer I1 : FirstArray) {
	L1.add(I1);
	
}
List<Integer> L2=new ArrayList<Integer>();
for (Integer I2 : SecondArray) {
	L2.add(I2);
}
System.out.println(L1);
//ArrayList<int[]> L1 = new ArrayList(Arrays.asList(FirstArray));
//ArrayList<int[]> L2 = new ArrayList(Arrays.asList(SecondArray));
L1.retainAll(L2);
System.out.println("The Common values is " +L1);

	
}
	}


