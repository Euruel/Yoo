package lch;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student(); // 인스턴스생성.
		st1.setStudentNo("1111");
		st1.setName("aaaa");
		st1.setMajor("english");
		Student st2 = new Student("2222", "bbbb", "math");

		System.out.println(st1);
		System.out.println(st2);

		int num = 4;

		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}
	}
}
