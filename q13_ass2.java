package java_project;

import java.util.HashMap;

public class q13_ass2 {

	public static void main(String[] args) {
		int a = 111001112;
		int arr[] = new int[10];
		HashMap <Integer,Integer> obj = new HashMap<>();
		while(a!=0) {
			int i = a % 10;
			arr[i]++;
//			obj.put(i, obj.getOrDefault(i, 0)+1);
			a = a /10;
		}
		for(int j:arr) {
			if(j!=0) {
				System.out.println(j +  " occurs ");
			}
			
		}
		
		
			
		
		System.out.println(obj);
		
		
		
		
		
		
		
		
		

	}

}
