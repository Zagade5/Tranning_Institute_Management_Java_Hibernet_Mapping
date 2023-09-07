package SubClass;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Branch {
	@Id
	private int Bid;
	private String Bname;
	private String location;
	
	@OneToMany(targetEntity = Trainer.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "Trainer", referencedColumnName = "Bid")
	private List<Trainer> trainer;

	@OneToMany(targetEntity = Addmission.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "Addmission", referencedColumnName = "Bid")
	private List<Addmission> addmission;

	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(columnDefinition = "Course", referencedColumnName = "Bid")
	private List<Course> course;

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(List<Trainer> trainer) {
		this.trainer = trainer;
	}

	public List<Addmission> getAddmission() {
		return addmission;
	}

	public void setAddmission(List<Addmission> addmission) {
		this.addmission = addmission;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Branch [Bid=" + Bid + ", Bname=" + Bname + ", location=" + location + ", trainer=" + trainer
				+ ", addmission=" + addmission + ", course=" + course + "]";
	}

	public Branch(int bid, String bname, String location, List<Trainer> trainer, List<Addmission> addmission,
			List<Course> course) {
		super();
		Bid = bid;
		Bname = bname;
		this.location = location;
		this.trainer = trainer;
		this.addmission = addmission;
		this.course = course;
	}

	public Branch() {
		// TODO Auto-generated constructor stub
	}
	
	

}
