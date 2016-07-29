package sms;

public class SmsConstructor {
	String user, lectureName, classroom;
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
	public String getUser(){
		return user;
	}
}
