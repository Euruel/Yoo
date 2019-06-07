package lch;

public class StudyClasss {

	String className;
	Professor professor;
	Student[] studentAry;

	public StudyClasss() {
		super();
	}

	public StudyClasss(String className, Professor professor, Student[] studentAry) {
		super();
		this.className = className;
		this.professor = professor;
		this.studentAry = studentAry;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Student[] getStudentAry() {
		return studentAry;
	}

	public void setStudentAry(Student[] studentAry) {
		this.studentAry = studentAry;
	}
	

}
