package tollappapitest;

import base.Base;
import base.BaseAssertion;
import base.GetToken;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TollCollectionListRequestTest{
    private static Logger log = LogManager.getLogger(Base.class.getName());
    private static String uri = "https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";
    /**
     Here are 10 test cases to validate the TollCollectionList Request response:

     1. Test case: Verify the status code is 200.
     Expected: Response status code should be 200.

     2. Test case: Check if the "IsSuccess" field is set to "YES".
     Expected: "IsSuccess" should be equal to "YES".

     3. Test case: Ensure the "message" field in the response is "success".
     Expected: "message" should be equal to "success".

     4. Test case: Validate the number of items in the "body" array.
     Expected: The "body" array should contain 13 items.

     5. Test case: Verify that all "collectionDate" values are in the correct format.
     Expected: All "collectionDate" values should be in the format "dd-MMM-yyyy".

     6. Test case: Check if the "tollRate" values are numeric and greater than or equal to 0.
     Expected: All "tollRate" values should be numeric and non-negative.

     7. Test case: Ensure that the "createdAt" values are in the correct format.
     Expected: All "createdAt" values should be in the format "dd-MMM-yyyy" or "dd-MMM-yyyy HH:mm:ss".

     8. Test case: Verify that the "updatedBy" field is either an empty string or a non-empty string.
     Expected: "updatedBy" should be either an empty string or a non-empty string.

     9. Test case: Check if the "id" values are unique.
     Expected: All "id" values should be unique within the response.

     10. Test case: Ensure that the "tollCollectionMethod" values are either "Cash" or "Card".
     Expected: "tollCollectionMethod" should be either "Cash" or "Card" for all items in the "body" array.

     These test cases cover various aspects of the API response, including status code, field values, data formats, and uniqueness constraints. You can use these test cases to validate the correctness and consistency of the API response.
     * */

    //     1. Test case: Verify the status code is 200.
    //     Expected: Response status code should be 200.
    @Test
    public void validateResponse(){
        GetToken getTokenObject = new GetToken();
        String token = getTokenObject.getToken();
        // Set the authorization header
        String authorizationHeader = "Bearer " + token;

        // Set the base URL for the request
        RestAssured.baseURI = uri;

        // Make the GET request
        Response response = RestAssured.given()
                .header("Authorization", authorizationHeader)
                .when()
                .get("/toll-collection-list");

        // Print the response
        response.prettyPrint();

        // Add Response Assertion
        BaseAssertion.verifyStatusCode(response, 200);
        log.info("ValidateResponse Test Passed");
    }
}
