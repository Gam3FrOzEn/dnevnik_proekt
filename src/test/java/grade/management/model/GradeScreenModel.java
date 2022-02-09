package grade.management.model;

import dnevnik.model.Clas;
import dnevnik.model.Grade;
import dnevnik.model.Parent;
import grade.service.GradeService;

public class GradeScreenModel {

	private String username;
	private String password;
	private String email;
	private Parent parent;
	private Clas clas;
	private String message;
	private Grade grade;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public Clas getClas() {
		return clas;
	}
	public void setClas(Clas clas) {
		this.clas = clas;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void createStudentButton() {
		this.message = GradeService.createStudent(this.username, this.password, 
				this.email, this.parent, this.clas);
		
	}
	
	public boolean checkStudentExist() {
		return GradeService.checkStudentExist();
	}
	
	public void assignGradeButton() {
		this.message = GradeService.assignGrade(this.grade);
	}
	
}
