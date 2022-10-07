package com.example.fragmentactionbarmenuexampleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentactionbarmenuexampleandroid.databinding.ActivityMainBinding
import com.example.fragmentactionbarmenuexampleandroid.fragments.BlankFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.container, BlankFragment()).commit()

    }
}