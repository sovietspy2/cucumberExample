import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MySteps2 {

    Integer result;
    Integer a;
    Integer b;

    @Given("Two numbers are {int} and {int}")
    public void twoNumbersAreAnd(int arg0, int arg1) {

        a=arg0;
        b=arg1;

    }

    @When("the user run the method")
    public void theUserRunTheMethod() {
        result = Main.getBiggerNumber(a,b);
    }

    @Then("We should receive the number {int} because they are identical")
    public void weShouldReceiveTheNumberBecauseTheyAreIdentical(int arg0) {

        Assert.assertEquals( (Integer) arg0, result);

    }
}
