import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstRestCallTest {
    public static void main(String[] args) {
        /**
         * 1. Get Token /oauth2/token
         * 2. Submit /test/submit
         * What do we need to make a call to get Token?
         * a. Host Name
         * b. End Point
         * c. Body
         * d. Authorization -->
         * e. Send headers Content-Type, Authorization
         * f. What type call POST
         * Processing the response
         * a. Validated Status Code
         * b. Get access_token and store in a variable
         *
         * */
        String hostName = "https://izaan-test.auth.us-east-1.amazoncognito.com";
        String endpoint = "/oauth2/token";
        String url = hostName + endpoint;
        //x-www-form-urlencoded

        RequestSpecification requestSpecification = RestAssured.given().body("StringBody");
        requestSpecification.contentType("");

       Response response = requestSpecification.post(url);

       // Try at home https://stackoverflow.com/questions/39937240/android-post-request-not-working


    }
}
