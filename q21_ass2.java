package java_project;

import java.util.Arrays;

public class q21_ass2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,66,89};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max - min);

	}

}
