import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MySteps3 {

    Integer result;

    @Given("no input")
    public void noInput() {

    }

    @When("the user run the method again")
    public void theUserRunTheMethodAgain() {
        result= Main.getBiggerNumber(null,null);
    }

    @Then("We should receive the default value zero")
    public void weShouldReceiveAnException() {
        Assert.assertEquals( result, (Integer) 0);
    }
}
