package dnevnik.model;
import java.util.*;

public class Subject {

	private String subjectName;
    private Set<Clas> clases;
    
    public Subject() {
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Set<Clas>getClases() {
        return this.clases;
    }

    public void setClases(Set<Clas>clases) {
        this.clases = clases;
    }

}