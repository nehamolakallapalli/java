package assessment1;
import java.util.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class StudentMain 
{
		public static void main(String[] args)
		{
			StudentMain demo = new StudentMain();
			demo.runApp();
		}
		Set<Student> set=new HashSet<>();
		public  void runApp() 
		{
			Student s1=new Student(22,"A11");
			set.add(s1);
			Student s2=new Student(23,"A13");
			set.add(s2);
			Student s3=new Student(20,"A12");
			set.add(s3);
			Student s4=new Student(21,"A14");
			set.add(s4);

			List<Student> list=toList(set);
		 }	   
			   
	     public List<Student> toList(Set<Student> set) 
		 {
			List<Student> list= new ArrayList<>();
			for (Student stobject : set) 
			{
				if(stobject.getAge()>21)
				{
				 	list.add(stobject);
			    }
		    }
			return list;
		 }
}
