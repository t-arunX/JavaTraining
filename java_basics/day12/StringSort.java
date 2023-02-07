package java_basics.day12;

import java.util.TreeSet;

public class StringSort {

	public static void main(String[] args) {
		String names[] = {"john","wick","Mickel","Reevs","Clinton"};
		
		TreeSet<String> ts = new TreeSet<>((a1,a2)-> a1.length()-a2.length());
		for(String s:names) ts.add(s);
		System.out.println(ts);
	}

}
