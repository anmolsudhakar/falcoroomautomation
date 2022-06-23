package com.example.falcohomeautomation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.content.Intent
import android.os.Handler
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import com.example.falcohomeautomation.homez

class splashscreen : AppCompatActivity() {
    //	#After completion of 2000 ms, the next activity will get started.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            FLAG_FULLSCREEN,
            FLAG_FULLSCREEN
        )
        //This method is used so that your splash activity
        //can cover the entire screen.
        setContentView(R.layout.activity_splashscreen)
        //this will bind your MainActivity.class file with activity_main.
        Handler().postDelayed({
            val intent = Intent(
                this, login2::class.java
            )
            //Intent is used to switch from one activity to another.
            startActivity(intent)
            //invoke the SecondActivity.
            finish()
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT.toLong())
    }

    companion object {
        private const val SPLASH_SCREEN_TIME_OUT = 2000
    }
}