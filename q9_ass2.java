package java_project;

public class q9_ass2 {

	public static void main(String[] args) {
		int a = -101;
		int i = a;
		int rel = 0;
		if(a<0) {
			System.out.println("it is not pallindrome");
		}
		else {
			while(a!=0) {
				int res = a % 10;
				rel = (rel * 10 )+ res;
				a = a /10;
				
				
			}
			if(i==rel) {
				System.out.println("it is pallindrome");
				
			}
			else {
				System.out.println("it is not pallindrome");
				
			}
			
		}
		
		
		

	}

}
