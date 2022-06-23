package com.example.falcohomeautomation

import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.EditText
import android.annotation.SuppressLint
import android.os.Bundle
import com.example.falcohomeautomation.R
import com.example.falcohomeautomation.homez
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.falcohomeautomation.led
import com.example.falcohomeautomation.homez.Companion.led as led1

class homez : AppCompatActivity() {
    var drawerLayout: DrawerLayout? = null
    var toolbar: Toolbar? = null
    var navigationView: NavigationView? = null
    private var ipxx1: EditText? = null


    @SuppressLint("WrongViewCast")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homez)
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationview)
        toolbar = findViewById(R.id.toolbar)
        led1 = findViewById<Button>(R.id.click)
        ipxx1 = findViewById<EditText>(R.id.ipadd)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_open,
            R.string.navigation_close
        )
        with(drawerLayout) {
            this?.addDrawerListener(toggle)
        }
        toggle.syncState()
        led!!.setOnClickListener {
            texr = ipxx1!!.text.toString()
            val ht1 = Intent(this, com.example.falcohomeautomation.led::class.java)
            startActivity(ht1)
        }
    }

    private fun ActionBarDrawerToggle(
        homez: homez,
        drawerLayout: DrawerLayout?,
        toolbar: Toolbar?,
        navigationOpen: Int,
        navigationClose: Int
    ) {
    }

    private fun setSupportActionBar(toolbar: Toolbar?) {}
    override fun getSupportActionBar(): ActionBar? {
        return supportActionBar
    }

    companion object {
        private var led: Button? = null

        @JvmField
        var texr: String? = null
    }
}

private fun DrawerLayout?.addDrawerListener(toggle: Unit) {

}


private fun Unit.syncState() {
    TODO("Not yet implemented")
}
