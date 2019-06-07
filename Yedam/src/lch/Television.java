package lch;

public class Television {
	static String company = "Google";
	static String browser = "Chrome";
	static String info;
	static {
		// 초기값이 복잡한 계산식을 통해 이루어질 때...
		info = company + " - " + browser;
	}
}
