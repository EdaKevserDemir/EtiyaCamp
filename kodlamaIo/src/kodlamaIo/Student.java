package kodlamaIo;

import java.util.ArrayList;

public class Student extends User {

	private ArrayList<Course> studentCourses;

	public Student() {
		
	}

	public ArrayList<Course> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentsCourses(ArrayList<Course> studentsCourses) {
		this.studentCourses = studentsCourses;
	}

	

}
