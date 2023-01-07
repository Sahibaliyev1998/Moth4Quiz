package com.example.moth4quiz

import android.app.ActionBar.LayoutParams
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import android.widget.Toast
import com.example.moth4quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),TextWatcher {

    private lateinit var adapter: Adapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAdd.setOnClickListener {
            val dialog =AlertDialog(this)
            dialog.dialog?.window?.attributes?.width = WindowManager.LayoutParams.MATCH_PARENT
            dialog.show(supportFragmentManager, "ljbcd")


        }

        adapter = Adapter(arrayListOf()){
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        }



    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun afterTextChanged(p0: Editable?) {
        TODO("Not yet implemented")
    }
}