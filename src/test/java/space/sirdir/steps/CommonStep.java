package space.sirdir.steps;

import cucumber.api.java.en.When;

import static java.lang.Thread.currentThread;
import static java.lang.management.ManagementFactory.getRuntimeMXBean;

public class CommonStep {

    @When("^run this step$")
    public void run_this_step() {
        System.out.println(currentThread().getId() + " " + getRuntimeMXBean().getName());
    }

}