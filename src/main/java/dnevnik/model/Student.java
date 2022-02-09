package dnevnik.model;
import java.util.*;

public class Student extends User {

	 private Parent parent;
	 private Clas clas;
	 private Set<Grade> grades;
	    
    public Student() {
    }

    
    
    public Student(String username, String password, String email, 
    		Parent parent, Clas clas) {
		super(username, password, email);
		this.parent = parent;
		this.clas = clas;
		this.grades = new HashSet<Grade>();
	}



	public Set<Grade> getGrades() {
        return this.grades;
    }

    public void setGrades(Set<Grade>grades) {
        this.grades = grades;
    }

    public Parent getParent() {
        return this.parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Clas getClas() {
        return this.clas;
    }

    public void setClas(Clas clas) {
        this.clas = clas;
    }

}