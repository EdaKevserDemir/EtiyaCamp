package kodlamaIo;
import java.util.ArrayList;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	
	private ArrayList<Course> courses;
	


	public Student() {
		courses = new ArrayList<Course>();
	}

	



	public ArrayList<Course> getCourses() {
		return courses;
	}






	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	
	
	
}
