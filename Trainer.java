package SubClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Trainer {
	@Id
    private int Did;
    private String Dname;
    private String subject;
	public int getDid() {
		return Did;
	}
	public void setDid(int did) {
		Did = did;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Trainer [Did=" + Did + ", Dname=" + Dname + ", subject=" + subject + "]";
	}
	public Trainer(int did, String dname, String subject) {
		super();
		Did = did;
		Dname = dname;
		this.subject = subject;
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
    
    

}
