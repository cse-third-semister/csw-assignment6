package java_project;

public class q11_ass2 {

	public static void main(String[] args) {
		int a = 142365;
		
		char arr [] = Integer.toString(a).toCharArray();
		int c = 0;
		for(int i:arr) {
			if((i-'0' )% 2 ==0) {
				c++;
				
			}
			
		}
		System.out.println(c);
		

	}

}
