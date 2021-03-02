import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MySteps4 {

    String value;

    String returnedValue;

    @Given("the text is {string}")
    public void theTextIs(String arg0) {
        value = arg0;
    }

    @Then("The method return {string}")
    public void theMethodReturn(String arg0) {
        Assert.assertEquals(arg0, Main.getCapitalizedString(value));
    }

    @Given("takes null input")
    public void takesNullInput() {
        returnedValue = Main.getCapitalizedString(null);
    }

    @Then("We should receive the default value which is empty string")
    public void weShouldReceiveTheDefaultValueWhichIsEmptyString() {
        Assert.assertEquals("",returnedValue);
    }
}
