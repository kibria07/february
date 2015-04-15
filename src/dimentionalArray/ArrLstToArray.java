package dimentionalArray;

import java.util.ArrayList;

public class ArrLstToArray {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>arrList= new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(3);
		arrList.add(2);
		
		System.out.println("contents of arrList "+ arrList);
		
		Integer arr[] = new Integer[arrList.size()];
		arr=arrList.toArray(arr);
		int count=0;
		System.out.println(count);
		for(int i : arr) count +=1;
		System.out.println("count is " + count);
		
		
		for(int j=0; j < arr.length;j++){
			System.out.println("sjth elemens is " + j);
		}
		
	}

}
