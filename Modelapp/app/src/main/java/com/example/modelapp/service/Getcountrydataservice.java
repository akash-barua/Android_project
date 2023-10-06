package com.example.modelapp.service;

import com.example.modelapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Getcountrydataservice {
    @GET("countries")
    Call<Result> getResult();

}
