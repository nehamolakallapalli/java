package assessment1;

public class Student 
{
		private int age;
		private String rollno;
		
		public Student(int age,String rollno) 
		{
			this.age=age;
			this.rollno=rollno;
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
		public int hashCode()
		{
			int hash=rollno.hashCode();
			return hash;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null ||!(obj instanceof Student)) {
				return false;
			}
			Student other = (Student) obj;
			boolean equalsResult=this.rollno.equals(other.rollno);
			return equalsResult;
		}
	}