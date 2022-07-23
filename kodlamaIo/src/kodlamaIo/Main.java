package kodlamaIo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		CourseManager courseManager = new CourseManager();
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Diger");

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		
		Instructor instructor2 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Atıl");
		instructor1.setLastName("Samancioglu");
		
		

		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java&react");
		course1.setDescription("1.5 Ay S�ren Yaz�l�m Geli�tirme Kamp�");
		course1.setCourseDuration(100);
		course1.getPrice();
		course1.setCategory(category1);
		course1.setInstructor(instructor1);

		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Java&react");
		course2.setDescription("2 Ay S�ren Yaz�l�m Geli�tirme Kamp�");
		course2.setCourseDuration(120);
		course2.getPrice();
		course2.setCategory(category1);
		course2.setInstructor(instructor1);

		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Java");
		course3.setDescription("2 Ay suren yazılım gelistirme kampi");
		course3.setCourseDuration(120);
		course3.getPrice();
		course3.setCategory(category1);
		course3.setInstructor(instructor1);

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Merve");
		student1.setLastName("Demiraslan");
		student1.setStudentsCourses(new ArrayList<>());

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Merve");
		student2.setLastName("Demiraslan");
		student2.setStudentsCourses(new ArrayList<>());

		UserManager userManager=new StudentManager();
		userManager.add(student1);
		userManager.add(student2);
		userManager.add(instructor1);
		userManager.add(instructor2);
		

		for (User user : userManager.getAll()) {
			user.getFirstName();

		}

		System.out.println("��renci: " + student1.getFirstName() + "\t" + student1.getLastName());

	}

}
