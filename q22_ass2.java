package java_project;

import java.util.HashSet;

public class q22_ass2 {

	public static void main(String[] args) {
		int arr[] = {2,3,1,2,3,2,4,5,4};
		HashSet <Integer> obj = new HashSet<>();
		for(int i:arr) {
			obj.add(i);
		}
		System.out.println(obj);
		
		

	}

}
