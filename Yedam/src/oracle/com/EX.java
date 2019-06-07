package oracle.com;

public class EX {

	public static void main(String[] args) {
		int res = multi(3, 5);
		println("결과 값은" + res);
		
	}
	
	public static int multi(int a, int b) {
		return (a * b);
	}
	
	public static void println(int msg) {
	 System.out.println(msg);
	}
	
	public static void println(String msg) {
	System.out.println(msg);
	}
	// 스트링 문자열을 담을수 있음
    
	
	public static int absMinus (int a, int b) {
		if(a>b)
		return(a-b);
		else
		return(b-a);
	}
	
	public static double divide(int a, int b) {
		
	}
}
