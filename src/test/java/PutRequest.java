import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class PutRequest {
    public static void main(String[] args) {
        RestAssured.baseURI=("https://reqres.in/api/users/2");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body("{\"name\": \"ruwida\",\"job\": \"tester\"}");
        Response response =request.put();
        response.prettyPrint();
        int statuscode= response.getStatusCode();
        Assert.assertEquals(statuscode,200);
    }
}
