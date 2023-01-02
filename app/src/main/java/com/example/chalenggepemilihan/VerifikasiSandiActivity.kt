package com.example.chalenggepemilihan

import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class VerifikasiSandiActivity : AppCompatActivity() {
    private lateinit var editText1 : EditText
    private lateinit var editText2 : EditText
    private lateinit var editText3 : EditText
    private lateinit var editText4 : EditText
    private lateinit var editText5 : EditText
    private lateinit var editText6 : EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_sandi)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        editText3 = findViewById(R.id.editText3)
        editText4 = findViewById(R.id.editText4)
        editText5 = findViewById(R.id.editText5)
        editText6 = findViewById(R.id.editText6)

        val filters = arrayOfNulls<InputFilter>(1)
        filters[0] = InputFilter.LengthFilter(1) //Filter to 20 characters

        editText1.filters = filters

        editText1.addTextChangedListener( GenericTextWatcher(editText1));
        editText2.addTextChangedListener( GenericTextWatcher(editText2));
        editText3.addTextChangedListener( GenericTextWatcher(editText3));
        editText4.addTextChangedListener( GenericTextWatcher(editText4));
        editText5.addTextChangedListener( GenericTextWatcher(editText5));
        editText6.addTextChangedListener( GenericTextWatcher(editText6));


    }


}
class GenericTextWatcher private constructor(view: View) : TextWatcher {
    private val view: View

    init {
        this.view = view
    }

    override fun afterTextChanged(editable: Editable) {
        // TODO Auto-generated method stub
        val text = editable.toString()
        when (view.getId()) {
            R.id.editText1 -> if (text.length == 1) et2.requestFocus()
            R.id.editText2 -> if (text.length == 1) et3.requestFocus() else if (text.length == 0) et1.requestFocus()
            R.id.editText3 -> if (text.length == 1) et4.requestFocus() else if (text.length == 0) et2.requestFocus()
            R.id.editText4 -> if (text.length == 0) et3.requestFocus()
        }
    }

    override fun beforeTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
        // TODO Auto-generated method stub
    }

    override fun onTextChanged(arg0: CharSequence, arg1: Int, arg2: Int, arg3: Int) {
        // TODO Auto-generated method stub
    }
}

