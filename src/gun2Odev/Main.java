package gun2Odev;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1= new Teacher(1,"Engin","Demiro�","Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahiptir.");
		
		Teacher teacher2= new Teacher(2,"Semih","Elibol","Yaz�l�m Geli�ticisi");
				
		Teacher[] teachers= {teacher1,teacher2};
		
		System.out.println("---��retmen Listesi---");
		for(Teacher teacher:teachers) {
			System.out.println(teacher.firstName+" "+teacher.lastName);			
		};		
		System.out.println("��retmen say�s�:"+teachers.length);
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
		Course course1=new Course(1,1,"C# + ANGULAR","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)");
				
		Course course2=new Course(2,1,"JAVA + REACT","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
				
		Course course3=new Course();
		course3.id=3;
		course3.teacherId=2;
		course3.name="JAVA";
		course3.detail="Java ��renmek";
		
		Course[] courses= {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name+" | ��retmen Id:"+course.teacherId);			
		};
		
		System.out.println("Kurs say�s�:"+courses.length);
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
