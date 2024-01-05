package java_project;

public class q2_ass2 {

	public static void main(String[] args) {
		int a = 6;
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
		if(sum % 2 ==0) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	

	}

}
