package lch;

public class Println {
	public static void main(String[]args) {
		System.out.println("main 메소드입니다.시작.");
//		int num1 = 30;
//		Student student new Student(null,null, null);
		int num = println(30, 2);
		Bus bus = new Bus();
		bus.start();
		bus.run();
		bus.stop();
		if(bus.cardCheck(100))
			System.out.println("어서오세요.");
		else
			System.out.println("내려가세요.");
//		System.out.println(num + "main 메소드입니다.종료.");
		
	}
	static int println(int a,int b){
		System.out.println("~~~~~~~~~~~");
		return a/b ;
	}
}
//