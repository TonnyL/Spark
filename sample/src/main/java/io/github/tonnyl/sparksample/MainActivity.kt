package io.github.tonnyl.sparksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.tonnyl.spark.Spark
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var _spark: Spark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _spark = Spark(frameLayout, Spark.ANIM_GREEN_PURPLE, 4000)
        _spark.startAnimation()
    }

    override fun onDestroy() {
        super.onDestroy()

        _spark.stopAnimation()
    }

}
