package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void returnDataValue() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                    .post("/post")
                .then().log().all()
                    .statusCode(200)
                    .body("data", org.hamcrest.Matchers.equalTo("some data"));
    }
}
