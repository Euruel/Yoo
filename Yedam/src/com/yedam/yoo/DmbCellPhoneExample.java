package com.yedam.yoo;

class CellPhone {
	String model;
	String color;
	CellPhone(){
		
	}
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	void poworON() {
		System.out.println("전원을 켭니다.");
	}

	void poworOFF() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자신:" + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대:" + message);
	}

	void handUp() {
		System.out.println("전화를 끊습니다.");
	}
}

class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone() {
		
	}
	DmbCellPhone(String model, String color, int channel) {
			super(model,color); // 부모클래스의 생성자(arguments 2개인)
			this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널:" + channel);
	}

	void changeChnnelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을" + channel + " 번으로 바꿉니다. ");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	
	@Override //재정의 
	void handUp() {
		System.out.println("Dmb 폰을 끊습니다.");
		8iujhui8jhnmk kiuhn-`-++ 
		
		 *
	}
}

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("SMT-300","red",10);
		dcp.bell();
		dcp.turnOnDmb();
		System.out.println(dcp.channel);
		dcp.changeChnnelDmb(20);
		System.out.println(dcp.channel);
		dcp.turnOffDmb();

	}
}
