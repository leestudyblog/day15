package test_1;

import java.util.ArrayList;

class Test04{
	public ArrayList<String> test() { 
		ArrayList<String> arr = new ArrayList<>();
		arr.add(0, "hellow");
		// arr.put("hello"); 
		System.out.println(arr);
		return arr;
		
	}
}




public class test05 {
	public static void main(String[] args) {
		Test04 t =new Test04();
		t.test();
		
	}

}
