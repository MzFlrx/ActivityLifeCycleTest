package com.example.activitylifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecycletest.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate")
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater) // 最新的绑定方式
        val view = binding.root
        setContentView(view)
        binding.startDialogActivity.setOnClickListener{
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
        binding.startNormalActivity.setOnClickListener{
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestory")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart")
    }
}