package java_project;

public class q7_ass2 {

	public static void main(String[] args) {
		int p = -2;
		int b = 4;
		double rel = 1;
		if(p>0) {
			for(int i=0;i<p;i++) {
				rel = rel * b;
			}
			
			System.out.println(rel);
			
		}
		else {
			p = p * -1;
			for(int i=0;i<p;i++) {
				rel = rel * b;
			}
			System.out.println(1/rel);
			
			
		}
		
		
		
		
	

	}

}
