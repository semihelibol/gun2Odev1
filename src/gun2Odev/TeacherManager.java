package gun2Odev;

public class TeacherManager {
		
	public void add(Teacher teacher) {
		System.out.println("Yeni Öðretmen Eklendi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	public void update(Teacher teacher) {
		System.out.println("Öðretmen Güncellendi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	public void delete(Teacher teacher) {
		System.out.println("Seçili Öðretmen Silindi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	
}
