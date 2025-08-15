package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userAuthenticationSteps {
    @Given("a valid auth register payload")
    public void a_valid_auth_register_payload() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("A valid auth register payload");
    }
    @When("I execute POST request to {string} endpoint")
    public void i_execute_post_request_to_endpoint(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Execute POST request");
    }
    @Then("the response status should be {int} OK")
    public void the_response_status_should_be_ok(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Response status is 200 OK");
    }
    @Then("the response payload should contain JSON")
    public void the_response_payload_should_contain_json() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Response body is in JSON");
    }
    @Then("the response body should have the id field")
    public void the_response_body_should_have_the_id_field() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Response body has id field");
    }
}
