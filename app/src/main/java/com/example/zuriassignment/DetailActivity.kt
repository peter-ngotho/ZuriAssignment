package com.example.zuriassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zuriassignment.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name:String?= null
    private var detail:String?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(ListAdapter.LOGO_EXTRA,0)
        name = intent.getStringExtra(ListAdapter.NAME_EXTRA)
        detail = intent.getStringExtra(ListAdapter.FACT_EXTRA)
        setUpFactDetail()
    }
    private fun setUpFactDetail(){
        binding?.detailTV?.text = detail
        binding?.logoTV?.setImageResource(logo)
        title = name


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}