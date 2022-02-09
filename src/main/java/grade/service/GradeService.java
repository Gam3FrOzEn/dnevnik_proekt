package grade.service;

import java.util.ArrayList;

import dnevnik.model.Clas;
import dnevnik.model.Grade;
import dnevnik.model.Parent;
import dnevnik.model.Student;
import dnevnik.model.User;

public class GradeService {

	private static ArrayList<Student> studentDB = new ArrayList<Student>();
	
	public static String createStudent(String username, String password, String email, 
			Parent parent, Clas clas) {
		
		
		if(username == null || password == null || email == null 
				|| parent == null || clas == null)
			return "Невалидни данни";
		
		Student student = new Student(username, password, email, parent, clas);
		studentDB.add(student);
		return "Ученикът е успешно създаден";
	}
	
	public static boolean checkStudentExist() {
		if(studentDB.size() > 0)
			return true;
		else 
			return false;
		
	}
	
	public static String assignGrade(Grade grade) {
		if(grade.getGradeType() < 2 || grade.getGradeType() > 6)
			return "Оценката не е валидна";
		
		studentDB.get(0).getGrades().add(grade);
			return "Оценката е успешно нанесена";
		
	}
}
