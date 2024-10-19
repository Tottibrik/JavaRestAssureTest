package com.restassuredapitemplate.tests.petstore;

import com.restassuredapitemplate.bases.TestBase;
import com.restassuredapitemplate.requests.petstore.Getpetidrequest;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;



public class Getpetidtest  extends TestBase {
    @Test
    public void  ObterDadosDoPetComSucesso(){
        //Arrange
        int petId = 10;
        int statusCodeEsperado = HttpStatus.SC_OK;
        //Act
        Getpetidrequest getpetidrequest = new Getpetidrequest(petId);
        ValidatableResponse response = getpetidrequest.executeRequest();

        //Assert
        response.statusCode(statusCodeEsperado);
    }


        @Test
        public void ObterDadosDoPetComIdInvalido () {
        //Arrange
        int petId = 99999;
        int statusCodeEsperado = HttpStatus.SC_NOT_FOUND;
        //Act
        Getpetidrequest getpetidrequest = new Getpetidrequest(petId);
        ValidatableResponse response = getpetidrequest.executeRequest();

        //Assert
        response.statusCode(statusCodeEsperado);
    }
    }
