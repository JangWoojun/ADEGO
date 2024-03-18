package com.woojun.adego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.woojun.adego.databinding.ActivityAlarmBinding

class AlarmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlarmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlarmBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}