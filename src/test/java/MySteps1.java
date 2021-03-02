import org.junit.Assert;

public class MySteps1 {

    Integer result;
    Integer a;
    Integer b;

    @io.cucumber.java.en.Given("Two numbers {int} and {int}")
    public void twoNumbersAnd(int arg0, int arg1) {
        a=arg0;
        b=arg1;
    }

    @io.cucumber.java.en.When("run the method")
    public void runTheMethod() {
        result = Main.getBiggerNumber(a,b);
    }

    @io.cucumber.java.en.Then("We should receive the number {int}")
    public void weShouldReceiveTheNumber(int arg0) {
        Assert.assertEquals( (Integer) arg0, result);
    }
}
