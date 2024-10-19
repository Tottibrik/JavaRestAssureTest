package com.restassuredapitemplate.requests.petstore;

import com.restassuredapitemplate.bases.RequestRestBase;
import io.restassured.http.Method;
public class Getpetidrequest extends RequestRestBase {
    public Getpetidrequest(int petId){
        requestService = "/pet/" +petId;
        method = Method.GET;
    }
}
