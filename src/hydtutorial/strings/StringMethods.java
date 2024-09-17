package hydtutorial.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="  Gopal ade ";
		String s2="hello";
		
		String s3="HELLO";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("l"));
		System.out.println(s1.contains("g"));
		System.out.println(s1.startsWith("m"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.toCharArray());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim().toUpperCase());
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.substring(2));
	
		
		}

}
