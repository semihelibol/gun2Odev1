package gun2Odev;

public class CourseManager {
	
	public void add(Course course) {
		System.out.println("Yeni Kurs Eklendi: "+course.name);
	}
	
	public void update(Course course) {
		System.out.println("Kurs G�ncellendi: "+course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Se�ili Kurs Silindi: "+course.name);
	}
}
