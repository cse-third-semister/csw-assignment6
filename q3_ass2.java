package java_project;

public class q3_ass2 {

	public static void main(String[] args) {
		int a = 1010;
		int i=0;
		int j=3;
		
		String s1 = Integer.toString(a);
		StringBuilder s = new StringBuilder(s1);
		char e = s.charAt(i);
		s.setCharAt(i,s.charAt(j));
		s.setCharAt(j, e);
		
		System.out.println(s);

		
		
		
		
		
		
		

	}

}
