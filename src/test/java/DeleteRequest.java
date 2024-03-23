import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class DeleteRequest {
    public static void main(String[] args) {
        RestAssured.baseURI=("https://reqres.in/api/users/2");
        RequestSpecification request = RestAssured.given();
        Response response =request.delete();
        response.prettyPrint();
        int statuscode= response.getStatusCode();
        Assert.assertEquals(statuscode,204);
    }
}
