package io.github.tonnyl.sparksample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.tonnyl.spark.Spark
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spark = Spark.Builder()
                .setView(frameLayout)
                .setDuration(4000)
                .setAnimList(Spark.ANIM_GREEN_PURPLE)
                .build()
        spark.startAnimation()

    }
}
