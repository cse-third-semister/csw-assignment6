package java_project;

public class q8_ass2 {

	public static void main(String[] args) {
		int a = -123;
		int rel = 0;
		while(a!=0) {
			int res = a % 10;
			rel = (rel * 10 )+ res;
			a = a /10;
			
			
		}
		System.out.println(rel);
		

	}

}
