package assessment1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentMain 
{
		Set<Student> set = new HashSet<Student>();
		public static void main(String[] args) {
			StudentMain demo = new StudentMain();
			demo.runApp();
	}
	public  void runApp() {
		Student s1=new Student(22,"A11");
		set.add(s1);
		Student s2=new Student(23,"A13");
		set.add(s2);
		Student s3=new Student(20,"A12");
		set.add(s3);
		Student s4=new Student(21,"A14");
		set.add(s4);

		Iterator<Student> iterator=set.iterator();
		  
		   while(iterator.hasNext()) {		 
				Student student = iterator.next();
				System.out.println("Age=" + student.getAge() + " " + "Rollno"+ student.getRollno());
			  
		   }
		   
		display(studentage);
	}
		   
		   
		   private void display(Set <Student> studentage) 
		   {
				for (Student stobject : studentage) 
				{
					int age=stobject.getAge();
					if(age>21)
					{
					System.out.println(age);
				   }
			   }
	      }
}
