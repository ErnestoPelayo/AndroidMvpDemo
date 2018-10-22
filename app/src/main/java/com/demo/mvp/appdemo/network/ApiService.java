package com.demo.mvp.appdemo.network;

import com.demo.mvp.appdemo.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("pokemon")
    Call<PokemonResponse> fetchPokemons();
}