package gun2Odev;

public class TeacherManager {
		
	public void add(Teacher teacher) {
		System.out.println("Yeni ��retmen Eklendi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	public void update(Teacher teacher) {
		System.out.println("��retmen G�ncellendi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	public void delete(Teacher teacher) {
		System.out.println("Se�ili ��retmen Silindi: "+teacher.firstName+" "+teacher.lastName);
	}
	
	
}
