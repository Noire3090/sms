package sms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testingclass {
	static String  eos = null;
	public static void main(String args[]){
		String username = null;
		String lecturename = null;
		String classroom = null;
		int lecturept = 0;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ユーザー名,講義名,講時,教室を入力");
		try{
			for(int i = 0; i < 4; i++){
				switch(i){
				case 0:
					username = stdIn.next();
					if(username != null){
						secureCode();
					}else{
						errorCode();
					}
					break;
				case 1:
					lecturename = stdIn.next();
					if(lecturename != null){
							secureCode();
						}else{
							errorCode();
						}
					break;
				case 2:
					lecturept = stdIn.nextInt();
					if(lecturept != 0){
						secureCode();
					}else{
						errorCode();
					}
					break;
				case 3:
					classroom = stdIn.next();
					if(classroom != null){
						secureCode();
					}else{
						errorCode();
					}
					break;
				}
			}
		}catch(InputMismatchException e){
			eos = e.getMessage();
			System.out.println(eos);
			System.exit(0);
		}
		eos = LectureDB.lecture(username, lecturename, lecturept, classroom);
		System.out.println(eos);
	}
	private static void errorCode() {
		System.out.println("入力エラー");

	}
	private static void secureCode() {
		System.out.println("入力成功");
	}

}
