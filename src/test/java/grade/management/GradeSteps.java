package grade.management;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dnevnik.model.Clas;
import dnevnik.model.Grade;
import dnevnik.model.Parent;
import grade.management.model.GradeScreenModel;

public class GradeSteps {

	private GradeScreenModel gradeScreenModel;

	@Given("^Потребителят отваря екрана за управление на оценки$")
	public void openGradeScreenModel() throws Throwable {
	    gradeScreenModel = new GradeScreenModel();
	}
	
	
	
	@When("^Въвежда потребителско име$")
	public void въвежда_потребителско_име() throws Throwable {
	    gradeScreenModel.setUsername("Petko");
	}

	@When("^Въвежда парола$")
	public void въвежда_парола() throws Throwable {
		gradeScreenModel.setPassword("krava23");
	}

	@When("^Въвежда E-mail$")
	public void въвежда_E_mail() throws Throwable {
		gradeScreenModel.setEmail("cowlover23@gmail.com");
	}

	@When("^Въвежда Родител$")
	public void въвежда_Родител() throws Throwable {
	    gradeScreenModel.setParent(new Parent());
	}

	@When("^Въвежда Клас$")
	public void въвежда_Клас() throws Throwable {
	    gradeScreenModel.setClas(new Clas());
	}
	
	
	@When("^Натисне бутона за създаване на ученик$")
	public void натисне_бутона_за_създаване_на_ученик() throws Throwable {
	    gradeScreenModel.createStudentButton();
	}
	
	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void вижда_съобщение(String arg1) throws Throwable {
	    assertEquals(arg1, gradeScreenModel.getMessage());
	}
	
	
	@Given("^Ученикът съществува$")
	public void ученикът_съществува() throws Throwable {
	    assertEquals(true, gradeScreenModel.checkStudentExist());
	}

	@When("^Въвежда оценка, която не е в диапазона от две до шест$")
	public void въвежда_оценка_която_не_е_в_диапазона_от_две_до_шест() throws Throwable {
	    gradeScreenModel.setGrade(new Grade((byte) 8));
	}

	@When("^Натисне бутона за нанасяне на оценка$")
	public void натисне_бутона_за_нанасяне_на_оценка() throws Throwable {
	    gradeScreenModel.assignGradeButton();
	}
	
	@When("^Въвежда оценка, която е в диапазона от две до шест$")
	public void въвежда_оценка_която_е_в_диапазона_от_две_до_шест() throws Throwable {
		gradeScreenModel.setGrade(new Grade((byte) 6));
	}
	
}
