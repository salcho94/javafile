package c_control;

import java.util.Scanner;

public class 연습 {
	public static void main(String[] args) {
//         switch 연습
		//층수를 입력받아서 출력해보자 
		Scanner cs=new Scanner(System.in);
		System.out.println("몇층으로 모실까용");		
		int b=cs.nextInt();
		

		switch(b) {
		case 1:System.out.println("약국");break;
		case 2:System.out.println("정형외과 ");break;
		case 3:System.out.println("피부과");break;
		case 4:System.out.println("치과");break;
		case 5:System.out.println("헬스장");break;
		default:System.out.println("층수가 존재하지 않습니다");break;
		}
         
		System.out.println(b+"층입니다");
	}

}







