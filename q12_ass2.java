package java_project;

public class q12_ass2 {

	public static void main(String[] args) {
		int a = 678454;
		int b = 7831;
		String c = Integer.toString(a);
		int l = c.length();
		int zero = l - 2;
		int f = (int)Math.pow(10, zero);
		int num1 = a/f;
		
		
		String s = "";
		while(s.length()<2) {
			int rel = b % 10;
			s = rel + s; 
			b = b /10;
		}
		
		System.out.println(num1+s);
		
		
		
		
		

	}

}
