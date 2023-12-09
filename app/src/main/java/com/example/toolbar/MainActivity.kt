package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        initUi()
    }

    private fun initUi() {
        binding.customtoolbar.ivback.setOnClickListener{
            Toast.makeText(this, "Back Button Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customtoolbar.ivnotif.setOnClickListener{
            Toast.makeText(this, "Notifikasi Button Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customtoolbar.ivsetting.setOnClickListener{
            Toast.makeText(this, "Setting Button Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.customtoolbar.tvtoolbar.text = "Custom Toolbar"
    }
}