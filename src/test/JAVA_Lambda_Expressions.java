package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA_Lambda_Expressions {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("Akif");
		list.add("Hilmi");
		list.add("Mete");
		list.add("Emre");
		list.add("Kemal");
		list.add("Bahadir");
		list.add("Hamza");
		
		Long count = list.stream().filter(str -> str.length() > 4).count();
		System.out.println(count);
		
		System.out.print("Names longer than 4 letters: ");
		list.stream().filter(str -> str.length() > 4).forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		System.out.print("Sorted list: ");
		list.stream().sorted().forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		System.out.print("First 3 elements of the sorted list: ");
		list.stream().sorted().limit(3).forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		System.out.print("New list of names (in uppercase): ");
		List<String> newList = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		for (String string : newList) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		boolean inList = list.stream().anyMatch(str -> str.equalsIgnoreCase("hilmi"));
		if (inList) {
			System.out.println("Hilmi is in the list");
		}else {
			System.out.println("Hilmi is not in the list");
		}
				
		

	}

}
