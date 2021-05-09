package com.example.zuriassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zuriassignment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    var adpter:ListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adpter = ListAdapter(this,DummyData.funfacts)
        binding?.factListView?.adapter = adpter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}