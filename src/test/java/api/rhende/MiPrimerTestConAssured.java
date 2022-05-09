package api.rhende;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class MiPrimerTestConAssured {

    @Test
    public void obtenerUnaResponse(){

        Response respuesta = RestAssured.get("https://reqres.in/api/users?page=2");
        int statusCode = respuesta.getStatusCode();
        System.out.println(respuesta.getContentType());;
        System.out.println(respuesta.getBody().asString());
        System.out.println(respuesta.getBody().prettyPrint());
        Assert.assertEquals(200, statusCode);
    }

    @Test
    public void testeandoDataDelResponse(){
        //RestAssured :: baseURI ->
        baseURI = "https://reqres.in/api";
        //BDD
        given().
                get("users?page=2").
                then().
                statusCode(200).body("data[1].id", equalTo(8));
    }

    @Test
    public  void testeandoGET() {
        //RestAssured :: baseURI
        baseURI = "https://reqres.in/api";

        //BDD
        get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].first_name", equalTo("Lindsay"));
    }

    @Test
    public  void testeandoPOST(){

        //RestAssured :: baseURI
        baseURI = "https://reqres.in/api";

        //Trabajar con Objetos JSON
        JSONObject request;

        request = new JSONObject();
        request.put("name", "Raul");
        request.put("job", "DevOps");
        given().header("Content-type", "application/json").
            contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()). // consumimos el Objeto JSON creado mas arriba
                when().
                post("/users").
                then().statusCode(201).log().all();
    }
}
