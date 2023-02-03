package java_basics.day8;

// import java.util.Arrays;
// import java.util.Comparator;


public class TestPersonByComparator {

	public static void main(String[] args) {
		Object people[] = {
				new PersonByComparator("dileep",27),
				new PersonByComparator("sai",23),
				new PersonByComparator("pradeep",24),
				new PersonByComparator("anjali",22)
		};
		
		//by implementing comparator interface 
		// Arrays.sort(people,new CompareByAge());
		// for(var v:people) System.out.println(v.toString());

	}

}
