package java_project;

public class q1_ass2 {

	public static void main(String[] args) {
		int a = 7;
		String s = "";
		while(a!= 1) {
			s = (a % 2) + s;
			a  = a /2;
		}
		s = 1 + s;
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			sum = sum + s.charAt(i)-'0';
		}
		System.out.println(sum);
		
		
	}

}
