package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDupeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> L1= new ArrayList<Integer>();
		List<Integer> L2= new ArrayList<Integer>();
		int count=0;
		String result=" ";
	//Adding the arrays to list	
		for (Integer integer : arr) {
			 if(L1.contains(integer))
			 {
				L2.add(integer);
			 }
			 else
			 {
			L1.add(integer);
			 }
		}
		System.out.println("The duplicate value is" +L2);
			}

}
