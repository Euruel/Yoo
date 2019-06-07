package lch;

public class Bus {
	String busNo;
	int busLength;
	int busHeight;
	int busWidth; // 필드

	void run() {
		System.out.println("run ");
	}

	void start() {

	}

	void stop() {

	}
	boolean cardCheck(int busFee) {
		if(busFee>=1000)
			return true;
		return false;
	}
}
