package ngpanwei.bdd.stepdefs;

import static org.junit.Assert.assertNotNull;
import hcol.backlog.BackLog;
import hcol.backlog.Task;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaskStepdefs {
	BackLog backlog = null;

	@Before
	public void setup() {
		backlog = new BackLog();
	}
	
	@Given("^团队有任务 \"(.*?)\"$")
	public void 团队有任务(String taskName) throws Throwable {
		Task newTask = backlog.add(taskName);
		assertNotNull(newTask);
	}

	@When("^团队完成任务\"(.*?)\"$")
	public void 团队完成任务(String taskName) throws Throwable {
		Task task = backlog.setTaskStatus(taskName, Task.STATUS_DONE);
		assertNotNull("task should exist in backlog", task);
	}
	
	@Then("^团队去做下一个Feature$")
	public void 团队去做下一个feature() throws Throwable {
	    System.out.println("TODO NEXT FEATURE!!!");
	}
}
