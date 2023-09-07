package TestMain;

import java.util.ArrayList;
import java.util.List;

import SubClass.Addmission;
import SubClass.Branch;
import SubClass.Course;
import SubClass.Student;
import SubClass.Trainer;
import SubClass.TranningInst;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Institute {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Institute");
		EntityManager em  =  emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		   et.begin();
           
		 //  **********Institute to Branch one to many  mapping**********
		   
		   TranningInst institute = new TranningInst();
		   institute.setAid(11);
		   institute.setAname("profound");
		   
		   Branch branch=new Branch();
		   branch.setBid(21);
		   branch.setLocation("karvenagar");
		   branch.setBname("pune");
		   
		   Branch branch1=new Branch();
		   branch1.setBid(22);
		   branch1.setLocation("bandra");
		   branch1.setBname("mumbai");
		   
		   Branch branch2=new Branch();
		   branch.setBid(23);
		   branch.setLocation("vikasnagar");
		   branch.setBname("Banglore");
		   
		   List<Branch> list= new ArrayList<Branch> ();
		   list.add(branch);
		   list.add(branch1);
		   list.add(branch2);
		   
		  institute.setBranches(list);
		   
		 //  ********pune Branch**********
		   
		   Trainer tr=new Trainer();
		   tr.setDid(201);
		   tr.setDname("sushant");
		   tr.setSubject("java full stack");
		   
		   Trainer tr1=new Trainer();
		   tr1.setDid(202);
		   tr1.setDname("Gaurav");
		   tr1.setSubject("advance java");
		   
		   List<Trainer>trainer=new ArrayList<Trainer>();
		   trainer.add(tr1);
		   trainer.add(tr);
		   
		
		   
		  
		   
		   //**********mumbai Branch**********
		   
		   Trainer tr2=new Trainer();
		   tr2.setDid(203);
		   tr2.setDname("Ankit");
		   tr2.setSubject("html");
		   
		   Trainer tr3=new Trainer();
		   tr3.setDid(204);
		   tr3.setDname("Mayank");
		   tr3.setSubject("css");
		   
		   List<Trainer>trainer1=new ArrayList<Trainer>();
		   trainer1.add(tr2);
		   trainer1.add(tr3);
		   
		 //  branch1.setTrainer(trainer1);
		   
		   //**********Banglore Branch**********
		   
		   Trainer tr4=new Trainer();
		   tr4.setDid(205);
		   tr4.setDname("Sudrashan");
		   tr4.setSubject("database");
		   
		   Trainer tr5=new Trainer();
		   tr5.setDid(207);
		   tr5.setDname("viru");
		   tr5.setSubject("python");
		   
		   List<Trainer> trainer2= new ArrayList<Trainer>();
		   trainer2.add(tr4);
		   trainer.add(tr5);
		   
		  branch.setTrainer(trainer);
		  branch1.setTrainer(trainer1);  
		  branch2.setTrainer(trainer2);
		   
		   //**********Addmission**********
		   
		   //Branch.....1
		   
		   Addmission ad = new Addmission();
		   ad.setCid(111);
		   ad.setEmail("sushantzade6@gmail.com");

		   Addmission ad1 = new Addmission();
		   ad1.setCid(112);
		   ad1.setEmail("gauravjumde7@gmail.com");
		   
		   List<Addmission> addmission1= new ArrayList<Addmission>();
		   addmission1.add(ad);
		   addmission1.add(ad1);
		   ;
 
		   //Branch.....2
		   
		   Addmission ad2 = new Addmission();
		   ad2.setCid(113);
		   ad2.setEmail("ankitchaudry8@gmail.com");
		   
		   Addmission ad3 = new Addmission();
		   ad3.setCid(114);
		   ad3.setEmail("mayankpendke9@gmail.com");
		   
		   List<Addmission> addmission2= new ArrayList<Addmission>();
		   addmission2.add(ad2);
		   addmission2.add(ad3);
		   
		   

		   //Branch.....3
		   
		   Addmission ad4 = new Addmission();
		   ad4.setCid(115);
		   ad4.setEmail("susdrshanrach2@gmail.com");
		   
		   Addmission ad5 = new Addmission();
		   ad5.setCid(119);
		   ad5.setEmail("virukarade3@gmail.com");
		   
		   List<Addmission> addmission3= new ArrayList<Addmission>();
		   addmission3.add(ad4);
		   addmission3.add(ad5);
		   
		   
		   branch.setAddmission(addmission1);
		   branch.setAddmission(addmission2);
		   branch.setAddmission(addmission3);	   
		   
		   
		   //**********Course**********
		   
		   //Branch.....1
		   
		   Course co = new Course();
		   co.setEid(10);
		   co.setCourseName("java");
		   
		   Course co1 = new Course();
		   co1.setEid(11);
		   co1.setCourseName("C++");
		   
		   //Branch......2
		   
		   Course co2 = new Course();
		   co2.setEid(12);
		   co2.setCourseName("DCA");
		   
		   //Branch......3
		   
		   Course co3 = new Course();
		   co3.setEid(13);
		   co3.setCourseName("machinelern");
		   
		   List<Course> course=new ArrayList<Course>();
		   course.add(co);
		   course.add(co1);
		   
		   List<Course> course1=new ArrayList<Course>();
		   course.add(co2);
		   
		   List<Course> course2=new ArrayList<Course>();
		   course.add(co3);
		   
		   branch.setCourse(course);
		   branch.setCourse(course1);
		   branch.setCourse(course2);
		   
		 //.........Student........	   
		   
		   
			  Student st=new Student();
			 st.setSid(105);
			 st.setSname("Sushant");
			 st.setAge(24);
			 st.setYearOfPassing(2022);
			 st.setCourse(course);
			 
			 Student st1=new Student();
			 st1.setSid(106);
			 st1.setSname("Gaurav");
			 st1.setAge(25);
			 st1.setYearOfPassing(2023);
			 st1.setCourse(course1);
			 
			 List<Student>student=new ArrayList<Student>();
			   student.add(st);
			   student.add(st1);


			 
			 Student st2=new Student();
			 st2.setSid(107);
			 st2.setSname("Ankit");
			 st2.setAge(26);
			 st2.setYearOfPassing(2024);
			 st2.setCourse(course2);
			 
			 
			 Student st3=new Student();
			 st3.setSid(108);
			 st3.setSname("Mayank");
			 st3.setAge(27);
			 st3.setYearOfPassing(2025);
			 st3.setCourse(course);
			 
			 
			 List<Student>student1=new ArrayList<Student>();
			   student1.add(st2);
			   student1.add(st3);

			 
			 Student st4=new Student();
			 st4.setSid(109);
			 st4.setSname("Susdrshan");
			 st4.setAge(28);
			 st4.setYearOfPassing(2026);
			 st4.setCourse(course1);
			 
			 
			 Student st5=new Student();
			 st5.setSid(110);
			 st5.setSname("Viru");
			 st5.setAge(29);
			 st5.setYearOfPassing(2027);
			 st5.setCourse(course2);
			 
			 List<Student>student2=new ArrayList<Student>();
			   student2.add(st4);
			   student2.add(st5);

			  
			 ad.setStudent(st);
			 ad1.setStudent(st1);
			 ad2.setStudent(st2);
			 ad3.setStudent(st3);
			 ad4.setStudent(st4);
			 ad4.setStudent(st5);
			 
		  
		   
		   //*************Save all Objects***********
		   
		   //*************Institute and Branch Obejct Save*************
		   
		   em.persist(institute);
		   
		 
		   
		   //*************Trainer Object Save***********
		   
		   em.persist(tr);
		   em.persist(tr1);
		   em.persist(tr2);
		   em.persist(tr3);
		   em.persist(tr4);
		   em.persist(tr5);
		   
		   //*************Branch Object Save************
		   
		   em.persist(branch);
		   em.persist(branch1);
		   em.persist(branch2);
		   
		   //***********Addmission Object Save***********
		   
		   em.persist(ad);
		   em.persist(ad1);
		   em.persist(ad2);
		   em.persist(ad3);
		   em.persist(ad4);
		   em.persist(ad5);
		   
		   //***********Course Object Save**************
		   
		   em.persist(co);
		   em.persist(co1);
		   em.persist(co2);
		  // em.persist(co3);
		   
		   //***********Student Object Save************
		   
		   em.persist(st);
		   em.persist(st1);
		   em.persist(st2);
		   em.persist(st3);
		   em.persist(st4);
		   em.persist(st5);
		   
		   
		   em.close();
		   et.commit();
		    System.out.println("Success")	;	    
		    }
		
		
		
		
		
		
	}


