package com.example.chalenggepemilihan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class DetailPemilihanActivity : AppCompatActivity() {
    private lateinit var btnData : Button
    private lateinit var btnHasil : Button
    private lateinit var textHide : LinearLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemilihan)

        btnData = findViewById(R.id.btnDataPemilih)
        btnHasil = findViewById(R.id.btnHasilPemilihan)
        textHide = findViewById(R.id.textHide)

//        btnData.setOnClickListener{
//            val visibility = View.GONE
//            val intent = Intent(this, )
//            startActivity(textHide)
//
//
//        }
//         Hide
// Show
//        view.visibility = View.VISIBLE
    }
}