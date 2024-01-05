package java_project;

import java.util.HashMap;

public class q23_ass2 {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,5,5,9,9};
		HashMap<Integer,Integer> obj = new HashMap<>();
		for(int i:arr) {
			obj.put(i, obj.getOrDefault(i, 0)+1);
		}
//		System.out.println(obj);
		for(int k:obj.keySet()) {
			if(obj.get(k)==1) {
				System.out.println(k);
			}
		}
	
		
		
		

	}

}
