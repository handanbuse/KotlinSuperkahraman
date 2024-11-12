package com.example.kotlinsuperkahraman

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinsuperkahraman.databinding.ActivityMainBinding
import superkahraman
import superkahramanAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Binding ile layout'u bağla
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val superman= superkahraman("Superman","Gazeteci",R.drawable.superman)
        val ironman= superkahraman("Iron man","Holding sahibi",R.drawable.ironman)
        val thor= superkahraman("Thor","Gök gürültüsü tanrısı",R.drawable.thor)

       val superkahramanListesi= ArrayList<superkahraman>()
        superkahramanListesi.add(superman)
        superkahramanListesi.add(ironman)
        superkahramanListesi.add(thor)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerRow)
        val adapter = superkahramanAdapter(superkahramanListesi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter


    }
}