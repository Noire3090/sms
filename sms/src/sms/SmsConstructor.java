package sms;

public class SmsConstructor {
	String userName, lectureName, classroom;
	int lecturept;
	public SmsConstructor(){}
	public SmsConstructor(String userName, String lectureName,
			 int lecturept, String classroom){
		this.userName = userName;
		this.lectureName = lectureName;
		this.lecturept = lecturept;
		this.classroom = classroom;
	}
}
