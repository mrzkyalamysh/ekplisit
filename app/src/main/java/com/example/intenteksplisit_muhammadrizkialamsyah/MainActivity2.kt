package com.example.intenteksplisit_muhammadrizkialamsyah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvData = findViewById<TextView>(R.id.tvData)

        val nim = intent.getStringExtra("NIM")
        val nama = intent.getStringExtra("NAMA")

        tvData.text = """
            Data yang dimasukkan:
            NIM: $nim
            NAMA: $nama
        """.trimIndent()
    }
}