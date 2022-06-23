package com.example.falcohomeautomation

import android.os.AsyncTask
import com.example.falcohomeautomation.homez
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL

abstract class on4 : AsyncTask<Void?, Void?, String?>() {
    protected fun doInBackground(vararg voids: Void): String? {
        try {
            val url = URL("http://" + homez.texr + "/led4on")
            val httpURLConnection = url.openConnection() as HttpURLConnection
            val inputStream = httpURLConnection.inputStream
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        } catch (e: MalformedURLException) {
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }

    override fun onPostExecute(aVoid: String?) {
        super.onPostExecute(aVoid)
    }
}