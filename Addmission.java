package SubClass;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Addmission {
	@Id
	private int Cid;
	private String email;
	
	
	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "Student", referencedColumnName = "Sid")
	private Student student;


	public int getCid() {
		return Cid;
	}


	public void setCid(int cid) {
		Cid = cid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Addmission [Cid=" + Cid + ", email=" + email + ", student=" + student + "]";
	}


	public Addmission(int cid, String email, Student student) {
		super();
		Cid = cid;
		this.email = email;
		this.student = student;
	}


	public Addmission() {
		// TODO Auto-generated constructor stub
	}
	
	

}
