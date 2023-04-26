package test_1;

import java.util.Scanner;

class TestClass{
	public int test() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("숫자입력 : ");
		n1 = sc.nextInt();
		n2= sc.nextInt();
		if (n1>n2) {
			System.out.println("큰 수 : "+n1);
			return n1;
		}else {
			System.out.println("큰 수 : "+n2);
			return n2;
		}
		
	}
}


public class test02 {

	public static void main(String[] args) {
		TestClass t= new TestClass();
		t.test();
		
	}

}
