package dnevnik.model;
//import java.util.*;

public class Teacher extends User {

	private Clas clas;
	
    public Teacher() {
    }

    public Clas getClas() {
        return this.clas;
    }

    public void setClas(Clas clas) {
        this.clas = clas;
    }

}