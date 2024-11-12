package com.example.kotlinsuperkahraman

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinsuperkahraman.databinding.ActivityMainBinding
import com.example.kotlinsuperkahraman.databinding.ActivityTanitimBinding
import superkahraman


class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTanitimBinding.inflate(layoutInflater)
        val view=binding.root
        enableEdgeToEdge()
        setContentView(view)

        val adapterdangelen=intent
        val secilenkahraman=adapterdangelen.getSerializableExtra("sacilenkahraman") as? superkahraman

        secilenkahraman?.let {
            binding.textviewmeslek.text=it.meslek
            binding.textviewIsim.text=it.isim
            binding.imageView.setImageResource(it.gorsel)
        }






        }
    }
