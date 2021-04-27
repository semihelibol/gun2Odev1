package gun2Odev;

public class CourseManager {
	
	public void add(Course course) {
		System.out.println("Yeni Kurs Eklendi: "+course.name);
	}
	
	public void update(Course course) {
		System.out.println("Kurs Güncellendi: "+course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Seçili Kurs Silindi: "+course.name);
	}
}
