package org.pursuit.unit_04_assessment.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {
    private static Retrofit echinodermsInstance;

    public static Retrofit getInstance() {
        if (echinodermsInstance != null) {
            return echinodermsInstance;
        }
        echinodermsInstance = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return echinodermsInstance;
    }

    private RetrofitSingleton() {
    }
}
