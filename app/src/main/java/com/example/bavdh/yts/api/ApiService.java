package com.example.bavdh.yts.api;

import com.example.bavdh.yts.model.MoviesListResponse;
import com.example.bavdh.yts.utils.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET(Constants.Api.MOVIES_LIST)
    Observable<MoviesListResponse> getMoviesList();
}
