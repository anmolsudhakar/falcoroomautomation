package com.example.falcohomeautomation

import android.os.AsyncTask.execute
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.falcohomeautomation.R
import com.example.falcohomeautomation.led
import com.example.falcohomeautomation.off2
import com.example.falcohomeautomation.on3
import com.example.falcohomeautomation.off3
import com.example.falcohomeautomation.off4
import com.example.falcohomeautomation.off1
import com.example.falcohomeautomation.on1
import com.example.falcohomeautomation.on2
import com.example.falcohomeautomation.on4

class led : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_led)
        on1 = findViewById<View>(R.id.but1on) as Button
        off1 = findViewById<View>(R.id.but1off) as Button
        on2 = findViewById<View>(R.id.but2on) as Button
        off2 = findViewById<View>(R.id.but2off) as Button
        on3 = findViewById<View>(R.id.but3on) as Button
        off3 = findViewById<View>(R.id.but3off) as Button
        on4 = findViewById<View>(R.id.but4on) as Button
        off4 = findViewById<View>(R.id.but4off) as Button
        on1!!.setOnClickListener {
            val process1 = on1
                process1.execute()

        }
        on2!!.setOnClickListener {
            val process1 = on2
            process1.execute()
        }
        off1!!.setOnClickListener {
            val process1 = off1
                process1.execute()

        }
        off2!!.setOnClickListener {
            val process1 = off2
            process1.execute()
        }
        on3!!.setOnClickListener {
            val process1 = on3
            process1.execute()
        }
        off3!!.setOnClickListener {
            val process1 = off3
            process1.execute()
        }
        on4!!.setOnClickListener {
            val process1 = on4
            process1.execute()
        }
        off4!!.setOnClickListener {
            val process1 = off4
            process1.execute()
        }
    }

    companion object {
        private var on1: Button? = null
        private var on2: Button? = null
        private var on3: Button? = null
        private var on4: Button? = null
        private var off1: Button? = null
        private var off2: Button? = null
        private var off3: Button? = null
        private var off4: Button? = null
    }
}

private fun Button?.execute() {
    TODO("Not yet implemented")
}
