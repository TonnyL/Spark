package io.github.tonnyl.sparksample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.github.tonnyl.spark.Spark;

/**
 * Created by lizhaotailang on 26/08/2017.
 */

public class AnotherActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spark spark = new Spark.Builder()
                .setDuration(4000)
                .setAnimList(R.drawable.custom_anim_list)
                .setView(findViewById(R.id.frameLayout))
                .build();
        spark.startAnimation();
    }
}
