package com.example.chikara.tooltipproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var builder: Tooltip.Builder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mHelloWorld.setOnClickListener({ v ->

            builder = Tooltip.Builder(v, R.style.Tooltip2)
                    .setCancelable(true)
                    .setDismissOnClick(false)
                    .setCornerRadius(20f)
                    .setGravity(Gravity.BOTTOM)
                    .setText("Abhilash Chikara")
            builder?.show()

        })
    }
}
