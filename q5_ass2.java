package java_project;

public class q5_ass2 {
	public static int multi(int a,int b) {
		if(a>0) {
			return b + multi(a-1,b);
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 11;
		System.out.println(multi(a,b));
		
				
		
		
		
	

	}

}
