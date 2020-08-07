package assessment1;

public class Student {
	private int age;
	private String rollno;
	
	
	public Student(int age,String rollno) {
		this.age=age;
		this.rollno=rollno;
	}
	
	public Student() {
		this(00,"");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return age == other.age && Objects.equals(rollno, other.rollno);
	}
}
