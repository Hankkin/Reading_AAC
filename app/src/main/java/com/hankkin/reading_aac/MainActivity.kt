package com.hankkin.reading_aac

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var liveStr: MutableLiveData<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveStr = MutableLiveData<String>()
        liveStr.observeForever {
            Log.e("Hankkin2", liveStr.value + lifecycle.currentState)
        }

    }

    override fun onStart() {
        super.onStart()
        liveStr.value = "start"
    }

    override fun onResume() {
        super.onResume()
        liveStr.value = "resume"
    }

    override fun onPause() {
        super.onPause()
        liveStr.value = "pause"
    }

    override fun onStop() {
        super.onStop()
        liveStr.value = "stop"
    }

    override fun onDestroy() {
        super.onDestroy()
        liveStr.value = "destroy"
    }


}
