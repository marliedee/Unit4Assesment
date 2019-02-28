package org.pursuit.unit_04_assessment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.pursuit.unit_04_assessment.controller.EchinodermsAdapter;
import org.pursuit.unit_04_assessment.model.EchinodermsWrapper;
import org.pursuit.unit_04_assessment.network.EchinodermsService;
import org.pursuit.unit_04_assessment.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private Retrofit retro;
    private String TAG = "MAIN_ACTIVITY";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.echinoderms_RV);
        retro = RetrofitSingleton.getInstance();
        EchinodermsService service = retro.create(EchinodermsService.class);
        Call<EchinodermsWrapper> echinodermsWrapperCall = service.getEchinodermsList();
        echinodermsWrapperCall.enqueue(new Callback<EchinodermsWrapper>() {
            @Override
            public void onResponse(Call<EchinodermsWrapper> call, Response<EchinodermsWrapper> response) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                EchinodermsAdapter adapter = new EchinodermsAdapter(response.body().getMessage());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<EchinodermsWrapper> call, Throwable t) {
                Log.d(TAG, "onResponse: " + t.getMessage());
            }
        });

    }
}
