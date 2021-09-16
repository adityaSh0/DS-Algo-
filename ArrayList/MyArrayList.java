package ArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList();
//		List<String> vegetables=new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		List<String> Remove=new ArrayList();
		Remove.add("Mango");
		
//		vegetables.add("Tomato");
//		vegetables.add("Brinjal");
//		
//		fruits.addAll(vegetables);
//		fruits.set(1,"Watermelon"); SET
		
//		System.out.println(fruits.get(0));  GET
		
//		fruits.clear(); // CLEAR
//		fruits.removeAll(Remove);  REMOVES COLLECTION
		
//		System.out.println(fruits.size()); //  SIZE
		
//		System.out.println(fruits.isEmpty()); // ISEMPTY
//		System.out.println(fruits.contains("Mango")); // CONTAINS
		
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp); // TOARRAY
		for(String e:temp) {
			System.out.println(e);
		}

	}

}
