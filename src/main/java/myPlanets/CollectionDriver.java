package myPlanets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDriver {

	public static void main(String[] args) {
		
		planetCollection();

	}

	private static void planetCollection() {
		
		List<Integer> integerList;
		integerList = new ArrayList<Integer>();
		
		integerList.add(4);
		
		
		List<Integer> myList = Arrays.asList(1, 3, 2, 6, 5, 5, 5, 7, 99);
		
		System.out.println("size: " + myList.size());
		
		
		for(Integer i : myList) {
			System.out.println(i);
		}
		
		
		System.out.println(myList.get(4));
		
		System.out.println(myList);
		
		
		
		Set<Integer> mySet = new HashSet<Integer>(myList);
		
		System.out.println("changed order and no duplicates b/c set:");
		
		System.out.println(mySet);
		
		for(Integer i : mySet) {
			System.out.println(i);
		}
		
	}

}
