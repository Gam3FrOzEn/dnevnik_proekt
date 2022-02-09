package dnevnik.model;
import java.util.*;

public class Parent extends User {

	private Set<Student> children;
	
    public Parent() {
    }

   public Set<Student>getChildren() {
        return this.children;
    }

    public void setChildren(Set<Student> children) {
        this.children = children;
    }

}