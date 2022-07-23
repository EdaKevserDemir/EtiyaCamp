package kodlamaIo;

import java.util.List;

public class Instructor extends User {

	private List<Course> instructorCourses;

	public Instructor() {
		super();
	}

	public List<Course> getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(List<Course> instructorCourses) {
		this.instructorCourses = instructorCourses;
	}

	
	

}
