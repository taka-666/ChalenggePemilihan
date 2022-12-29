package com.example.chalenggepemilihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class RiwayatPemilihanActivity : AppCompatActivity() {
    private lateinit var btnRiwayat : RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pemilihan)

        btnRiwayat = findViewById(R.id.riwayatPemilihan)

        btnRiwayat.setOnClickListener{
            val intent = Intent(this, DetailPemilihanActivity::class.java)
            startActivity(intent)
        }
    }
}