package StudentTeacherDemo;

public class Student {
 
	private String name;
	private String grades;
	
	public Student(String name, double grade) {
		this.name = name;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grades;
	}

	public void setGrade(double grade) {
		this.grades = grades;
		
		
	}
	public String toString() {
		return "Student [name=" + name + ", grade=" + grades+ ", getName()=" + getName() + ", getGrade()=" + getGrade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
