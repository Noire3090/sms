package sms;

public class SmsConstructor {
	static String user;
	String lectureName;
	String classroom;
	int lecturept;
	public SmsConstructor(){}
	public SmsConstructor(String user, String lectureName,
			 int lecturept, String classroom){
		this.user = user;
		this.lectureName = lectureName;
		this.lecturept = lecturept;
		this.classroom = classroom;
	}
	public SmsConstructor(String user) {
		this.user = user;
	}
	public static String getUser(){
		return user;
	}
}
