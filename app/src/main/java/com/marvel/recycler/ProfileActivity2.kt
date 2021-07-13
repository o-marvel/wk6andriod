package com.marvel.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marvel.recycler.databinding.ActivityProfile2Binding

class ProfileActivity2 : AppCompatActivity() {

    private lateinit var Binding : ActivityProfile2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Binding.root)

//        Binding.imageView.setImageDrawable(intent.getIntExtra(" flag"))
        Binding.nameView.text = intent.getStringExtra("manufacturer")
    }
}