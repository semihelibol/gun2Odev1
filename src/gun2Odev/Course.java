package gun2Odev;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,int teacherId,String name,String detail) {
		this.id=id;
		this.teacherId=teacherId;
		this.name=name;
		this.detail=detail;
	}
	
	int id;
	int	teacherId; 
	String name;
	String detail;
}
