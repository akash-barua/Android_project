package com.example.modelapp2.service;

import com.example.modelapp2.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Getcountrydataservice {
    @GET("countries")
    Call<Result> getResult();

}
