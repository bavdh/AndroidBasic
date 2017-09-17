package com.example.bavdh.yts.main;

import android.util.Log;

import com.example.bavdh.yts.api.Api;
import com.example.bavdh.yts.model.MoviesListResponse;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivityController {
    public static final String TAG = MainActivityController.class.getSimpleName();
    private MainActivity mainActivity;

    public MainActivityController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void getMoviesList() {
        Api.getApiService()
                .getMoviesList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MoviesListResponse>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull MoviesListResponse moviesListResponse) {
                        if(moviesListResponse.getStatus().equals("ok")) {
                            Log.i(TAG + "[MoviesList]", moviesListResponse.toString());
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
