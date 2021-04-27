package gun2Odev;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1= new Teacher(1,"Engin","Demiroğ","Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahiptir.");
		
		Teacher teacher2= new Teacher(2,"Semih","Elibol","Yazılım Gelişticisi");
				
		Teacher[] teachers= {teacher1,teacher2};
		
		System.out.println("---Öğretmen Listesi---");
		for(Teacher teacher:teachers) {
			System.out.println(teacher.firstName+" "+teacher.lastName);			
		};		
		System.out.println("Öğretmen sayısı:"+teachers.length);
		System.out.println("--------------------------");
		
		TeacherManager teacherManager=new TeacherManager();
		teacherManager.add(teacher1);
		teacherManager.add(teacher2);
		teacherManager.update(teacher1);
		teacherManager.update(teacher2);
		teacherManager.delete(teacher1);
		teacherManager.delete(teacher2);
		
		System.out.println("--------------------------");
		
		System.out.println("---Kurs Listesi---");
		Course course1=new Course(1,1,"C# + ANGULAR","Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
				
		Course course2=new Course(2,1,"JAVA + REACT","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
				
		Course course3=new Course();
		course3.id=3;
		course3.teacherId=2;
		course3.name="JAVA";
		course3.detail="Java Öğrenmek";
		
		Course[] courses= {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name+" | Öğretmen Id:"+course.teacherId);			
		};
		
		System.out.println("Kurs sayısı:"+courses.length);
		System.out.println("--------------------------");
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);		
		courseManager.add(course3);
		courseManager.update(course1);
		courseManager.update(course2);
		courseManager.update(course3);
		courseManager.delete(course1);
		courseManager.delete(course2);
		courseManager.delete(course3);
		
		System.out.println("--------------------------");
	}

}
