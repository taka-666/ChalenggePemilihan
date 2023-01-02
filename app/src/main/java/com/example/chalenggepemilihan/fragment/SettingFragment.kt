package com.example.chalenggepemilihan.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.chalenggepemilihan.R
import com.example.chalenggepemilihan.VerifikasiSandiActivity


class SettingFragment : Fragment() {
    private lateinit var btnUbahSandi : RelativeLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_setting, container, false)

        btnUbahSandi = view.findViewById(R.id.btnUbahSandi)

        btnUbahSandi.setOnClickListener{
            val intent = Intent(activity, VerifikasiSandiActivity::class.java)
            startActivity(intent)
        }


        return view


    }


}