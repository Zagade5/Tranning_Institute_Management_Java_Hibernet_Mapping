package SubClass;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity

public class Course {
	@Id
	private int Eid;
	private String courseName;
	@ManyToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Student> student;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [Eid=" + Eid + ", courseName=" + courseName + ", student=" + student + "]";
	}
	public Course(int eid, String courseName, List<Student> student) {
		super();
		Eid = eid;
		this.courseName = courseName;
		this.student = student;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	

}
