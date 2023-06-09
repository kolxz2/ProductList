package ru.nikolas_snek.productlist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.nikolas_snek.productlist.R

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel :MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivityTest", "Activity started")
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.shopListLiveData.observe(this){
            Log.d("MainActivityTest", it.toString())
        }
    }
}