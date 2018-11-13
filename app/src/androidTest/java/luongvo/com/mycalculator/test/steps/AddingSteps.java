package luongvo.com.mycalculator.test.steps;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.espresso.assertion.ViewAssertions;

import com.mauriciotogneri.greencoffee.GreenCoffeeSteps;
import com.mauriciotogneri.greencoffee.annotations.Given;
import com.mauriciotogneri.greencoffee.annotations.Then;
import com.mauriciotogneri.greencoffee.annotations.When;


import luongvo.com.mycalculator.R;

public class AddingSteps extends GreenCoffeeSteps {


    @Given("^I see an empty calculator$")
    public void iSeeAnEmptyLoginForm() {
        onViewWithId(R.id.text_view_result).isEmpty();
    }

    @When("^I press the (\\d|\\+|\\-|\\*|\\/|=|clear) button$")
    public void iPressThe1Button(String button) {
        switch (button) {
            case "1":
                onViewWithId(R.id.button1).click();
                break;
            case "2":
                onViewWithId(R.id.button2).click();
                break;
            case "3":
                onViewWithId(R.id.button3).click();
                break;
            case "4":
                onViewWithId(R.id.button4).click();
                break;
            case "5":
                onViewWithId(R.id.button5).click();
                break;
            case "6":
                onViewWithId(R.id.button6).click();
                break;
            case "7":
                onViewWithId(R.id.button7).click();
                break;
            case "8":
                onViewWithId(R.id.button8).click();
                break;
            case "9":
                onViewWithId(R.id.button9).click();
                break;
            case "0":
                onViewWithId(R.id.button0).click();
                break;
            case "+":
                onViewWithId(R.id.buttonAdd).click();
                break;
            case "-":
                onViewWithId(R.id.buttonSub).click();
                break;
            case "*":
                onViewWithId(R.id.buttonMul).click();
                break;
            case "/":
                onViewWithId(R.id.buttonDiv).click();
                break;
            case "=":
                onViewWithId(R.id.buttonEqual).click();
                break;
            case "clear":
                onViewWithId(R.id.buttonClear).click();
                break;
            default:
                throw new RuntimeException();
        }
    }


    @Then("^I see the number (\\d+) written$")
    public void iSeeTheNumberWritten(String number) {
        onViewWithId(R.id.text_view_result).check(ViewAssertions.matches(ViewMatchers.withText(number)));
    }

}