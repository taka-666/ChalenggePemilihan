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
    private lateinit var lyDataPemilih : LinearLayout
    private lateinit var lyHasilPemilihan : LinearLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pemilihan)

        btnData = findViewById(R.id.btnDataPemilih)
        btnHasil = findViewById(R.id.btnHasilPemilihan)
        lyDataPemilih = findViewById(R.id.lyDataPemilih)
        lyHasilPemilihan = findViewById(R.id.lyHasilPemilihan)

        var temp = false
        btnData.setOnClickListener {
            if(!temp){
                lyHasilPemilihan.visibility = View.GONE
//                Toast.makeText(applicationContext, "Invisible", Toast.LENGTH_SHORT).show()
            }
            else {
                lyDataPemilih.visibility = View.VISIBLE
//                Toast.makeText(applicationContext, "Visible", Toast.LENGTH_SHORT).show()
            }
            temp = !temp
        }

        btnHasil.setOnClickListener {
            if(!temp){
                lyDataPemilih.visibility = View.GONE
//                Toast.makeText(applicationContext, "Invisible", Toast.LENGTH_SHORT).show()
            }
            else {
                lyHasilPemilihan.visibility = View.VISIBLE
//                Toast.makeText(applicationContext, "Visible", Toast.LENGTH_SHORT).show()
            }
            temp = !temp
        }

    }
    fun View.setVisible(visible: Boolean) {
        visibility = if (visible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }
    fun View.isVisible(): Boolean {
        return visibility == View.VISIBLE
    }
}