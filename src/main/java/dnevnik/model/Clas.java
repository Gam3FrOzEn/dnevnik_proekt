package dnevnik.model;
import java.util.*;

/**
 * 
 */
public class Clas {

	private String clasName;
    private Teacher teacher;
    private Set<Student> students;
    private Set<Subject> subjects;
	
    public Clas() {
    }

    /**
     * 
     */
    

    public String getClasName() {
    	return this.clasName;
    }

    /**
     * @param className 
     * @return
     */
    public void setClasName(String clasName) {
    	this.clasName = clasName;
    }

    /**
     * @return
     */
    public Set<Student> getStudents() {
        return this.students;
    }

    /**
     * @param students 
     * @return
     */
    public void setStudent(Set<Student> students) {
        this.students = students;
    }

    /**
     * @return
     */
    public Teacher getTeacher() {
        return this.teacher;
    }


    /**
     * @param teacher 
     * @return
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return
     */
    public Set<Subject> getSubjects() {
        return this.subjects;
    }

    /**
     * @param subject 
     * @return
     */
    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

}