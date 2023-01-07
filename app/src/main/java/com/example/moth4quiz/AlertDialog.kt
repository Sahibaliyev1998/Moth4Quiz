package com.example.moth4quiz

import android.os.Bundle
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.moth4quiz.databinding.AlertDialogBinding

class AlertDialog(val textWatcher: TextWatcher) : DialogFragment() {

    lateinit var binding: AlertDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = AlertDialogBinding.inflate(layoutInflater,container,false)


        return binding.root
    }
}