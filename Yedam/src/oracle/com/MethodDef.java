package oracle.com;

public class MethodDef {

	public static void main(String[] args) {
		System.out.print("���α׷� ����.");
		hiEveryOne(20);
		hiEveryOne(29, 182 );
		goodbye();
		System.out.println("���α׷� ����.");
		
		}	

	public static void hiEveryOne(int age) {
			System.out.println("hello everyone");
			System.out.println(" I am " + age + " old.");
		}
	
	public static void hiEveryOne(int age, double height) {
		System.out.println("hello everyone");
		System.out.println(" I am " + age + " old.");
		System.out.println(" I am " + height + " cm. ");
		}
	
	public static int sumScore(int m, int e, int k) {
		return (m + e + k);
		}
	
	public static void goodbye() {
		}
	
	
}