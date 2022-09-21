package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingelemntArrayList {

	public static void main(String[] args) {

		int[] element = { 1, 2, 3, 4, 6, 7, 8 };

		List<Integer> L1 = new ArrayList<Integer>();
		List<Integer> L2 = new ArrayList<Integer>();
		
		for (Integer integer : element) {
			L2.add(integer);
		}
		Collections.sort(L2);
		
		for (Integer integer : element) {
			L1.add(integer);
		}
		Collections.sort(L1);

		for (int i = 1; i <= element.length; i++) {
			if (L1.get(i-1) != i) {
				System.out.println("Missing number --> " + i);
				break;
			}
		}

		/*
		 * for (int j = 0; j < L2.size() - 1; j++) { if (L1.get(i) != L2.get(j) + 1) {
		 * System.out.println(L2.get(i)); } }
		 */

		/*
		 * List<Integer> L2= new ArrayList<Integer>(); L2.add(5); for (Integer integer :
		 * element) {
		 * 
		 * L1.add(integer);
		 * 
		 * 
		 * } System.out.println("The value of the list 1"+ L1); L1.retainAll(L2);
		 * 
		 * System.out.println("Missing Element" +L2);
		 */
	}

}