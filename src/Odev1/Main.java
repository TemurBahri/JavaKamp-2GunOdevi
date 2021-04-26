package Odev1;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course (1,"Angular Kursu" ,"");
		Course course2 = new Course (2,"Java Kursu", "");
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
			
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(course1);
		courseManager.delete(course2);
		
		Category category1 = new Category (1,"Yazılım Sektörü");
		Category category2 = new Category (2,"Eğitmen Engin Demiroğ");
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.name);
			
		}
		
	}

}
