package lch;

public class StudentExample {

	public static void main(String[] args) {
	 	int num = 10;
		Student student = new Student();
		student.studentNo = "1111";
		student.name = "홍길동";
		student.major = "English";
		System.out.println("student.major");
		student.setMajor("Music");
		System.out.println(student.name);
		student.setName("김길동");
		
		student.setStudentbday("1991년12월7일")
			
		
System.out.println("=================");		
		String name = student.getName();
		System.out.println(name);
		System.out.println(student.studentNo);
		System.out.println(student.getStudentNo());
		System.out.println(student.getStudentInfo());
	}

}
