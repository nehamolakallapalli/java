package com.dxctraining.ui;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import com.dxctraining.*;

public class StudentMain 
{
			Map<String,Student> student=new HashMap<>();
			Set<Student> set1=new HashSet<>();
			Set<Student> set2=new HashSet<>();
			List<String> list=new ArrayList<>();
			
			public static void main(String args[]) 
			{
				StudentMain obj=new StudentMain();
				obj.runapp();
			}
			private void runapp() 
			{
				Student student1=new Student("101",27);
				student.put("101",student1);
				Student student2=new Student("102",28);
				student.put("102",student2);
				Student student3=new Student("103",25);
				student.put("103",student3);
				Student student4=new Student("104",24);
				student.put("104",student4);
				Set<String> keys = student.keySet();
				for(String s:keys) {
					Student fetch = student.get(s);
					if(fetch.getAge()%2==0) {
						set1.add(fetch);
					}
					else {
						set2.add(fetch);
					}
					list.add(fetch.getRollno());
				}
				display();
				
			}

			private void display() {
				System.out.println("Even Age Students");
				for(Student student:set1) {
					System.out.println("Rollno :"+student.getRollno()+"Age :"+student.getAge());
				}
				System.out.println("Odd Age Students");
				for(Student student:set2) {
					System.out.println("Rollno :"+student.getRollno()+"Age :"+student.getAge());
				}
				System.out.println("All Students rollno");
				for(String student:list) {
					System.out.println(student);
				}	
			}
}
