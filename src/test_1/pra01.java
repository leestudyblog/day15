/*
  <문제 : 통장 기능 구현>
   기능 : 입금, 인출, 출금, 잔액 확인
	 */
package test_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class PublicTest01{
	public int num;
	static ArrayList<String> addmoney = new ArrayList<>();

	static ArrayList<String> userAccount = new ArrayList<>();

	static ArrayList<Integer> putmoeny = new ArrayList<>();

	public static ArrayList<String> getAddmoney() {
		return addmoney;
	}

	public static void setAddmoney(ArrayList<String> addmoney) {
		PublicTest01.addmoney = addmoney;
	}

	public static ArrayList<String> getUserAccount() {
		return userAccount;
	}

	public static void setUserAccount(ArrayList<String> userAccount) {
		PublicTest01.userAccount = userAccount;
	}

	public static ArrayList<Integer> getPutmoeny() {
		return putmoeny;
	}

	public static void setPutmoeny(ArrayList<Integer> putmoeny) {
		PublicTest01.putmoeny = putmoeny;
	}
	
	//선택
	public int cho() {
		Scanner input = new Scanner(System.in);
		System.out.println("은행 프로그램");
		System.out.println("1.입금");//addmoney
		System.out.println("2.출금");//putmoeny
		System.out.println("3.계좌확인"); // userAccount
		System.out.println("4.종료");
		num=input.nextInt();
		return num;
	}
	//입금 (계좌확인, 입금, 잔액출력)
	public void addMon(){
		int cnt;
		System.out.println("확인 할 계좌를 입력하시오");
		Scanner input = new Scanner(System.in);
		String inputAccount=null;
		inputAccount = input.next();
		for (int i=0; i<userAccount.size(); i++) {
			if (inputAccount.equals(userAccount)) {
			System.out.println(""); 
			
		}
	}
		
	}
	//출금 (계좌확인, 출금, 잔액출력)
	public void putMon(){
		
		
	}
	//계좌확인(계좌확인, 없으면 계좌생성, 다시선택, 잔액출력)
	public void checkMon(){
		Scanner input = new Scanner(System.in);
		System.out.println("계좌를 입력하시오");
		String checkAcc, inputAcc;
		checkAcc = input.next();
		for (int i=0; i<userAccount.size(); i++) {
			if (checkAcc.equals(userAccount)) {
			System.out.println(checkAcc); 	
	}else {
		System.out.println("없는 계좌입니다. 계좌 생성하세요");
		System.out.println("계좌 번호 입력");
		inputAcc = input.next();
		userAccount.add(inputAcc);
		
		
	}
	       }
}
		}//class_end


public class pra01 {
	public static void main(String[] args) {
		PublicTest01 t= new PublicTest01();
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		int inputnum = t.cho(); //사용자 입력 값 받기
		
		if(inputnum == 1) {
			t.addMon();
			System.out.println("입금");
		}
		if(inputnum==2) {
			t.putMon();
			System.out.println("출금");
		}
		if(inputnum==3) {
			t.checkMon();
			System.out.println("잔액 확인");
		}
		if(inputnum==4) {
			System.out.println("종료");
		
		}else {
			System.out.println("다시 선택");
			
		}
		
	
			
		
			
			
		
		
		
		
		
		
		
	}//end

}
