package sms;

public class smsConstructor {
	String userName, lectureName, classroom;
	int lecturept;
	public smsConstructor(){}
	public smsConstructor(String userName, String lectureName,
			 int lecturept, String classroom){
		this.userName = userName;
		this.lectureName = lectureName;
		this.lecturept = lecturept;
		this.classroom = classroom;
	}
}
