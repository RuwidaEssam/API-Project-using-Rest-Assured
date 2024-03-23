import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class PostRegister {
    public static void main(String[] args) {
        RestAssured.baseURI=("https://reqres.in/api/register");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body("{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}");
        Response response =request.post();
        response.prettyPrint();
        int statuscode= response.getStatusCode();
        Assert.assertEquals(statuscode,200);
    }
}
