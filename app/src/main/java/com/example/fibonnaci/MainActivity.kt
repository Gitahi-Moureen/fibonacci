package com.example.fibonnaci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonnaci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fiboNumber=fibonuc(100)
        binding.rvNums.layoutManager=GridLayoutManager(this,2)
        val numAdapter = Fibonnaci_ass(fiboNumber)
        binding.rvNums.adapter=numAdapter


    }
    fun fibonuc(n:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size < 100){
            numbers.add(numbers[numbers.lastIndex] +numbers[numbers.lastIndex -1])
        }
        return numbers
    }
}