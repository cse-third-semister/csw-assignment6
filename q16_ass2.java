package java_project;

public class q16_ass2 {

	public static void main(String[] args) {
		int a = 4;
		int c = 20;
		boolean b = true;
		for(int i=a;i<=c;i++) {
			b = true;
			for(int j=2;j<i;j++) {
				if(i % j ==0) {
					b = false;
					break;
					
					
				}
			}
			if(b) {
				System.out.print(i + ",");
				
			}
			
			
		}
		
		
		
		

	}

}
