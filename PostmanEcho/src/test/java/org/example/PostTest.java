package org.example;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

 class PostTest {
     @Test
     void Post() {
         given()
                 .baseUri("https://postman-echo.com")
                 .body("Hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                 .when()
                 .post("/post")
// Проверки
                 .then()
                 .statusCode(200)
                 .body("data", equalTo("Hello"))

         ;
     }
 }
