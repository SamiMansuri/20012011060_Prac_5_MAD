package com.example.a20012011060_prac_5_mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20012011060_prac_5_mad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playButton.setOnClickListener {
            play()
        }

        binding.stopButton.setOnClickListener {
            stop()
        }
    }

    private fun play(){
        Intent(applicationContext, mediaSevice::class.java).putExtra(mediaSevice.DATA_KEY,mediaSevice.DATA_VALUE).apply {
            startActivity(this)
        }
    }

    private fun stop(){
        Intent(applicationContext, mediaSevice::class.java).apply {
            stopService(this)
        }
    }
}