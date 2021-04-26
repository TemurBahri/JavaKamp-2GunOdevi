package Odev1;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name + ": Kursu Eklendi");
	}
	
	public void delete (Course course) {
		System.out.println(course.name + ": Kursu silindi");
	}
	
	public void instructor (Course course) {
		System.out.println(course.instructor  +  ": Eğitmen Engin Demiroğ");
	}

}
