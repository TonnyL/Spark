package io.github.tonnyl.sparksample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.tonnyl.spark.Spark
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSpark: Spark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSpark = Spark.Builder()
                .setView(frameLayout)
                .setDuration(4000)
                .setAnimList(Spark.ANIM_GREEN_PURPLE)
                .build()

    }

    override fun onResume() {
        super.onResume()

        mSpark.startAnimation()
    }

    override fun onPause() {
        super.onPause()

        mSpark.stopAnimation()
    }

}
