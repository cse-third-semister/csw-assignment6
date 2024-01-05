package java_project;

public class q15_ass2 {

	public static void main(String[] args) {
		
		for(int i=2;i<=100;i++) {
			boolean b = true;
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
