package lch;

public class Student {
	// 필드
	String studentNo;
	String name;
	String major;
	String studentbday;

	// 생성자
	Student() {
	}

	Student(String studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}

	Student(String studentbday) {
		this.studentbday = studentbday;

	}

	// 메소드
	String getStudentNo() {
		return this.studentNo;
	}

	String getName() {
		return this.name;
	}

	String getMajor() {
		return this.major;
	}

	void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	void setName(String name) {
		this.name = name;
	}

	void setMajor(String major) {
		this.major = major;
	}

	public String getStudentbday() {
		return studentbday;
	}

	public void getStudentInfo() {
		System.out.println("학번" + this.studentNo + "이름" + this.name + "학과" + this.major + "생일" + this.studentbday);
		
	}

	public void setStudentbday(String studentbday) {
		this.studentbday = studentbday;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}

}