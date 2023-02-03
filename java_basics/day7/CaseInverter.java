package java_basics.day7;

public class CaseInverter {

	public static void main(String[] args) {
		String s = "abc DEF Ghi JKl mNo pQR StUV";
		int i=0;
		while(i<s.length()) {
			if(Character.isUpperCase(s.charAt(i))){
				System.out.print(Character.toLowerCase(s.charAt(i)));
			}
			else if(Character.isLowerCase(s.charAt(i))){
				System.out.print(Character.toUpperCase(s.charAt(i)));
			}
			else System.out.print(s.charAt(i));
			i++;
		}
	}

}
