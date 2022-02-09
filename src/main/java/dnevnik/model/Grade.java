package dnevnik.model;
import java.util.*;

public class Grade {

	private byte gradeType;
    private Set<Student> students;
	
    public Grade() {
    }

    
    
    public Grade(byte gradeType) {
		super();
		this.gradeType = gradeType;
	}



	public byte getGradeType() {
        return this.gradeType;
    }

    public void setGradeType(byte gradeType) {
        this.gradeType = gradeType;
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}