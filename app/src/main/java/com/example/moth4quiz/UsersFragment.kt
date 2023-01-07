package com.example.moth4quiz

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import com.example.moth4quiz.databinding.FragmentUsersBinding

class UsersFragment : Fragment(), TextWatcher {


    private lateinit var adapter: Adapter
    private lateinit var binding: FragmentUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentUsersBinding.inflate(layoutInflater,container,false)
        adapter = Adapter(arrayListOf()){
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }

        binding.apply {
            btnAdd.setOnClickListener {

            }
        }

        return binding.root
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(p0: Editable?) {
        TODO("Not yet implemented")
    }

}