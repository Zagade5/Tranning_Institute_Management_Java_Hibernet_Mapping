package SubClass;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity

public class Student {
	
	@Id
    private int Sid;
    private String Sname;
    private int yearOfPassing;
    private int age;
    
   @ManyToMany(cascade = CascadeType.ALL)
   // @JoinColumn(columnDefinition="",referencedColumnName="id")
    private List<Course>course;
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public int getYearOfPassing() {
	return yearOfPassing;
}
public void setYearOfPassing(int yearOfPassing) {
	this.yearOfPassing = yearOfPassing;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}
public Student(int sid, String sname, int yearOfPassing, int age, List<Course> course) {
	super();
	Sid = sid;
	Sname = sname;
	this.yearOfPassing = yearOfPassing;
	this.age = age;
	this.course = course;
}
public Student() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [Sid=" + Sid + ", Sname=" + Sname + ", yearOfPassing=" + yearOfPassing + ", age=" + age
			+ ", course=" + course + "]";
}
   
   

}
