package java_project;

public class q14_ass2 {

	public static void main(String[] args) {
		int a = 9;
		boolean b = true;
		for(int i=2;i<a-1;i++) {
			if(a % i ==0) {
				b = false;
				break;
				
				
			}
			
		}
		if(b) {
			System.out.println("prime");
			
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
