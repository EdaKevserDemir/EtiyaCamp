package kodlamaIo;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	
	
	
	public void add(Student newStudent) {
		String yeniKisi = newStudent.getFirstName()+newStudent.getLastName();
		for (Student student : students) {
			String kisi = student.getFirstName()+ student.getLastName();
		
			if(kisi.equals(yeniKisi)) {
				
				
			System.out.println("Bu ki�i eklenemez!");
			
			return;
			} 
			
		}
		
				students.add(newStudent);
			System.out.println("Ki�i Eklendi");
			}
	
	public void  addCourse(Student student, Course course) {
		
		if(student.getCourses().contains(course)) {
			System.out.println("Ayn� kurs eklenemez");
			return;
			
		}
		if(student.getCourses().size()<2) {
			student.getCourses().add(course);
			
		System.out.println("Kurs eklendi");
		}
		else {
			System.out.println("2'den fazla kurs eklenemez!");
		}
		
	
		}
	}




		

